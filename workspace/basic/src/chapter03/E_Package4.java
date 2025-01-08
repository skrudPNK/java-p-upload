package chapter03;

import java.util.Random;
import java.util.UUID;

public class E_Package4 {

	public static void main(String[] args) {
		
		// Random 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		
		// 범위 제약 (0~4)
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5, 10));
		
		// seed값 부여
		random = new Random(100);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		
		// UUID: 128비트의 고유식별자(소프트웨어에서의 표준 식별자)
		// 32개의 16진수로 나타내고 4개의 하이픈으로 나누어짐
		// 3.4 * 10^38개의 고유 값을 가질 수 있음
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);

	}

}
