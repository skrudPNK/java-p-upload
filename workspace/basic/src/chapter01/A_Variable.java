package chapter01;

// 자바의 중요 특징: 플랫폼독립성, 객체지향
// JVM, JRE, JDK

public class A_Variable {
        
	public static void main(String[] args) {
		//변수 (variable)
		// 데이터를 메모리에 저장하는데 사용되는 공간 요소
		// 생성(선언)할 때는 반드시 해당 변수가 갖는 데이터의 형태를 지정해야 함
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1;
		
		// 초기화(초기값을 넣는) 방법
		// 변수명 = 데이터;
		number1 = 22;
		
		// 선언과 동시에 초기화 방법을 많이 씀
		// 데이터타입 변수명 = 데이터;
		int number2 = 30;
		
		// 변수는 선언 후 반드시 초기화 후 사용할 수 있음
		// 변수에 지정된 타입의 데이터가 아니면 할당이 불가능
		
		number1 = 400; // 이는 초기화가 아닌 재할당 혹은 할당이라 함
		// 변수의 사용 목적
		// 1. 데이터 저장 목적
		// 2. 변할 수 있는 데이터에 대해서 이름을 부여하는 목적
		
		// 변수 명명 규칙
		// 1. (데이터 타입이 다르다고 할지라도) 중복된 변수명 사용 불가
		//    단, 대소문자는 구분함
		
		// 2. 연산자로 사용되는 특수문자는 포함 불가
		// int number_$ => 아직 변수명 못 정해서 임시로 이렇게 적어두기도 함

		// 3. 변수명은 숫자로 시작할 수 없음
		
		// 4. 키워드로만 구성되어있는 단어는 사용 불가
		
		// 비문법상 규칙(암묵적 룰)
		// 1. 띄워쓰기 규칙
		
		// (1) camel case
		// upper camel case => UpperCamelCase  - 클래스, 인터페이스
		// lower camel case => lowerCamelCase - 변수, 함수, 메서드
		
		// (2) snake case
		// UPPER_SNAKE_CASE => 상수형 변수 사용 시
		// lower_snake_case => 변수, 함수, 메서드
		
		// 2. 약어 사용 금지
		// 단축어 사용하지 않도록 약속. 독일식 표기법 사용하여 변수명 작성을 권장
		
		
		// 상수
		// 데이터형식 앞에 final(=마지막의) => 변경 불가능한
		final int MY_CONSTANT =30;
		// 선언과 동시에 초기화
		// 1. 리터럴에 이름을 부여하기 위해 많이 사용
		
		
		
		
		
		

	}

}
