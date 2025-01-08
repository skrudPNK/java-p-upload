package chapter01;

public class C_Datatype {

	public static void main(String[] args) {
		// 기본형/참조형 데이터 타입
		// 정수형 데이터 타입: 실수부 없음, 부호 있음
		// byte(1byte = 8bit): -128 ~ 127
		// short(2byte = 16bit) = -32,768 ~ 32,767
		// int(4byte = 32bit) = -2,147,483,648 ~ 2,147,483,647
		// int int1 = 22000000000L; // Type mismatch: cannot convert from long to int
		
		// long(8byte = 64bit) 
		
		// 실수형 데이터 타입
		// float(4byte)
		// 소수점 6~7 자리에서 오차 발생
		float float1 = 0.1234567F;
		
		// double(8byte) 
		// 소수점 15~17 자리에서 오차 발생
		// char, boolean
		
		// 형변환: 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		// 자동 형변환: 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		// 강제 형변환: 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생
		int number1 = 300;
		long number2 = number1;
		number1 = (int)number2;
		System.out.println(number2);
		byte number3 = (byte)number2;
		System.out.println(number3);
		
		// 배열: 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 컨테이너를 먼저 생성해야함
		// 한번 생성된 컨테이너의 크기 변경 불가
		
		int[] array = {1, 2, 3, 4, 5};
		for(int i=0; i<5; i++) {
			System.out.print(array[i]+" ");
		}
		
		// 배열의 길이 검색할 때는 .length
		System.out.println();
		System.out.println(array.length);
		int lastIndex = array.length - 1;
		System.out.println(array[lastIndex]);
		
		int[] array2 = new int[3]; //new로 만든건 전부 주소가 들어간다
		
		int[] example1 = new int[] {0, 0, 0};
		int[] example2 = example1; // example1의 주소값이 들어가있음
		System.out.println(example2);
		
		example1[0]= 99;
		System.out.println(example2[0]); //99가 들어가있음 왜냐면 'example1'은 주소값이니까
		
		char[] chars = {'e', 'x','a','m'};
		System.out.println(chars);
		
		System.out.println(example1);
		
		// String: 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		// 선언: String 변수명;
		// 생성: new String(문자열);
		// 초기화: 변수명 = "문자열";
		
		// 기본형 데이터 타입이 아니면 모두 참조형 데이터 타입이며 주소를 갖고 있음
		// 한번 생성된 String은 그 값을 바꿀 수 없다 ex) string3 = 
		// 바꾸고 싶으면 그냥 초기화 시키면 됨
		
		// 주요 기능, 메서드
		// 문자열 결합: +, conacat(String str)
		String str1 = "hello ";
		String str2 = "world";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		// 문자열 비교
		// equals(str) : 동등한지 비교
		// compareTo(str) : 문자열을 사전순으로 비교
		// compareToIgnoreCase(str) : 문자열을 사전순으로 비교(대소문자 구분하지 않음)
		
		// 문자열
		// length(): 문자열의 길이 반환
		System.out.println(str1.length());
		
		// 문자열 반환
		// toUpperCase(): 모두 대문자로
		// toLowerCase(): 모두 소문자로
		// trim(): 앞뒤 공백 제거
		// replace(찾을문자열, 바꿀문자열)
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll("wo", "qw"));
		
		// 문자열 찾기
		// indexOf(str)
		// lastIndexOf(str)
		// 없는 단어를 넣으면 -1을 반환
		
		// 부분 문자열
		// substring(시작idx, 종료idx)
		
		String string4 = null;
		string4.substring(0);
		
	}

}
