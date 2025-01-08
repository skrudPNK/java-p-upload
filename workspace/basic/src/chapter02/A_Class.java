package chapter02;

// 클래스: 공통된 속성과 기능을 정의한 것


class Example {

	// 속성: 객체가 가지는 정보나 상태의 정의
	// 일반적으로 변수 형태로 표현
	int attribute;
	double attribute2;
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	// 반드시 인스턴스가 생성된 후 사용 가능
	
	// 클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	// 필드의 데이터 타입 앞에 static 키워드를 사용하여 지정
	// 인스턴스 생성 없이 사용 가능
	
	// 클래스 변수를 사용할 때 주의점
	// 클래스 변수는 모든 인스턴스에 영향을 끼치므로 클래스로 접근하는 것을 권장
	// 일반적으로 클래스 변수는 final 키워드와 함께 사용
	static int instanceVariable;
	
	// 클래스의 메서드 : input은 여러개가 될 수 있지만 output(return)은 하나
	
	// 함수: 특정한 기능에 대한 정의
	// 반환타입 함수명(매개변수 타입 매개변수명, ...) { 함수 기능 선언 }
	
	// 함수의 목적
	// 1. 기능을 미리 정의해두고 사용할 땐 호출하여 사용하도록
	// (유지보수성 향상, 편리함, 구현내용 몰라도 됨, 코드 중복 제거 )
}




public class A_Class {
	
	static int fx1(int x) {
		int y = x*x + 2*x + 1 ;
		return y;
		
		
		
	}

	public static void main(String[] args) {
		
		// 인스턴스: 특정 클래스로 정의된 것을 실체화 한 것
		Example instancExample = new Example();
		
		instancExample.attribute = 10; //이건 변수임
		new Example().attribute = 20; // 1회성
		
		A_Class answer = new A_Class();
		
		answer.fx1(0);
		
		System.out.println(fx1(10));

	}

}
