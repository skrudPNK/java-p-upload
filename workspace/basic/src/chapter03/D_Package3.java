package chapter03;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class D_Package3 {

	public static void main(String[] args) {
		
		// Date 클래스: 날짜를 다루는 클래스
		// 대부분의 메서드는 1.1부터 사용하지 않도록 권장
		// 날짜의 데이터 타입으로 자주 사용됨(실제 날짜를 관리할 땐 문자열이 편함)
		Date dateNow = new Date();
		System.out.println(dateNow);
		
		// LocalDateTime 클래스: java 8부터 Date 클래스를 대체하기 위해 사용됨
		
		
		// Data를 LocalDataTime으로 변경
		// Data 인스턴스의 toInstant, toLocalDataTime 메서드 사용
		LocalDateTime dateToLocal = dateNow.toInstant()
									.atZone(ZoneId.systemDefault())
									.toLocalDateTime();
		
		System.out.println(dateToLocal);
		
		// Date를 String으로 변경
		// SimpleDateFormat 클래스를 사용하여 지정한 문자열 포맷으로 변경 가능
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String stringDate = simpleDateFormat.format(dateNow);
		System.out.println(stringDate);
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("a hh:mm yyyy-mm-dd");
		stringDate = simpleDateFormat2.format(new Date());
		System.out.println(stringDate);
		
		// LocalDateTime을 String으로 변경
		// DateTimeFormatter 클래스를 이용해서 변경 가능
		stringDate = dateToLocal.format(DateTimeFormatter.ofPattern("a hh:mm yyyy-mm-dd"));
		System.out.println(stringDate);
		
		
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("a hh:mm yyyy-mm-dd")));
		

	}

}
