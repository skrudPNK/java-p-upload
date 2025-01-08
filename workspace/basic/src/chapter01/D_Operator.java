package chapter01;

public class D_Operator {

	public static void main(String[] args) {
		
		int a = 15, b = 2;
		double c= 15.0, d=12.0 ;
		double doubleResult =0.0;
		
		// 산술 연산자: + - / * %
		// 정수와 정수를 나누면 실수부가 소멸
		
		doubleResult = a/b;
		System.out.println(doubleResult);
		
		// 증감연산자
		// 피연산자 값을 1 증가 혹은 감소.
		// 단항 연산자, 피연산자는 반드시 변수여야 함
		// i++ ++i i-- --i 같은거겠지.......
		// 코드는 위에서부터 아래로, 좌에서 우로
		// 상수에는(fianl)에는 증감연산자 수행 불가
		
		// 일반 대입 연산자: =
		// 좌항에 우항의 연산 결과를 할당
		// 좌앟에 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수에는 초기화 시에만 사용 가능
		
		// 복합 대입연산자: 타연산자=
		// 좌항에 우항의 연산 결과를 좌항에 할당
		// 좌항은 반드시 초기화가 이루어진 일반 변수여야 함
		int number = 15;
		number += 3;
		
		final int NUMBER2 = 10;
		// NUMBER2 += 1; 불가능
		
		// 비교연산자
		boolean booleanResult =true;
		
		// 같다, 다르다 연산자
		// ==, !=
		booleanResult = a != b; //true
		
		// >=, <=, >, <
		
		
		
		
		
		
	}

}
