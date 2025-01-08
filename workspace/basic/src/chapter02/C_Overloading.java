package chapter02;

// 면접시에 많이 물어봄: 자바 요소(JVM, JDK, JRE 차이가 뭐냐), 오버로딩-오버라이딩, 객체지향 특성, 제너릭, @, 

// 오버로딩(Overloading): 같은 클래스 내부에서 같은 이름의 메서드를 여러개 작성
// 오버로딩의 조건
// 1. 메서드의 이름을 중복 작성, 매개변수타입의 조합을 다르게
// 2. 메서드의 반환타입과 매개변수의 이름은 영향을 주지 않음

// println 도 오버로딩을 사용한 메서드이다

class newMath { 
	
	int add (int a, int b) {
		return a + b;
	}
	
	// 문제점
	// 1. 메서드의 이름이 불규칙적
	// 2. 사용 시에 불편함을 초래함
	double add2(double a, double b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add (int a, int b, int c) {
		return a + b + c;
	}
	
	double add(int a, double b) {
		return a + b;
	}
	
	
}



public class C_Overloading {

	public static void main(String[] args) {
		
		newMath newMath = new newMath();
		newMath.add(1.4, 4.2);

	}

}
