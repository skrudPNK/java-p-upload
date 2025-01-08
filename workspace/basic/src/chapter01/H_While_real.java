package chapter01;

import java.util.Scanner;

// 정상적인 작업이 바깥으로 나오는게 맞다

public class H_While_real {

	public static void main(String[] args) {
		// while: 반복 횟수가 결정되어있지 않을 때 사용
		// 조건이 true 인 동안 반복
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int result = 0;
		
		while(num != -1) {
			result += num;
			System.out.print("정수 입력: ");
			num = sc.nextInt();
		}
		
		System.out.println("계산 결과: " + result);

	}
	
	// 삼항연산자
	String resultString = false ? "참" : "거짓";
	
	// 1231 객체지향
	//
	// SOLID 원칙
	// SRP - 단일 책임 원칙: 한 클래스는 하나의 책임만 가져야 한다
	// OCP - 개방/폐쇄 원칙: 새로운 기능 추가에는 개방적, 변경은 최소화
	// 리스코프 치환 원칙: 자식클래스를 부모 클래스로 치환해도 제대로 동작해야 한다
	// 인터페이스 분리 원칙
	// 의존성 역전 원칙: 상위 모듈은 하위 모듈에 의존해서는 안된다. 추상화는 세부 사항에 의존해서는 안 된다. 

}
