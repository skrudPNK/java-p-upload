package chapter03;

import java.util.List;

//제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 지정하는 방법

class Test3 {
	String subject;
	char core;
}

// 제너릭 클래스: 클래스 내무에 있는 데이터 타입을 컴파일 시에 결정하는 클래스
// class 클래스명<매개타입>

class Test5<SCORE>{
	String subject;
	
}

class SuperClass{}
class MyClass extends SuperClass{}

// extends 클래스명: 
class SubClass extends MyClass{}


public class F_Generic {

	// 제너릭 메서드: 해당 메서드 매개변수의 타입이나 반환 타입을 컴파일 시에 결정하고자 할 때 사용
	// [제어자...] <매개타입> 반환타입 메서드명(...){...}
	static <T> void genericMethod(List<T> arg) {
		
		
	}
	
	public static void main(String[] args) {
	
		
		
		
		
	}

}
