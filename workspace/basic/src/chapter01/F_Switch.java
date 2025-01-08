package chapter01;

import java.util.Scanner;

public class F_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// switch 문 특정 변수 혹은 표현식에 따라 실행할 코드 블럭의 범위를 결정하는 것
		// 장점: 직관적임
		
		// 사용자에게 입력받음. 0이면 A, B, C 출력
		// 1 이면 B, C를 출략
		// 2면 C,
		// 3이면 D, E 출력
		// 그외: E
		
		System.out.println("정수 입력: ");
		int number = sc.nextInt();
		
		switch (number) {
		case 0: {
			System.out.println("A, B, C");
			break;
		}
		case 1: {
			System.out.println("B, C");
			break;
		}
		case 2: {
			System.out.println("C");
			break;
		}
		case 3: {
			System.out.println("D, E");
			break;
		}
		default:
			System.out.println("E");
		}

	}

}
