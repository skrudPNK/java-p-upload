package chapter03;

public class B_Package01 {

	public static void main(String[] args) {
		// wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있음
		// 기본형 데이터 타입의 풀네임의 첫글자를 대문자로 지정
		
		// int > Integer
		
		// toString 메서드 : 특정 타입을 문자열로 변경
		
		// Math 클래스: 수학 연산과 관련된 다양한 메서드 제공 클래스
		// 모든 메서드나 static인 클래스 메서드
		
		System.out.println(Math.round(3.1415  * 100));
		System.out.println(Math.round(3.1415 * 100) / 100); // 3
		
		System.out.println(Math.round(98765 / 100.0)); // 988
		System.out.println(Math.round(98765 / 100.0) * 100);

	}

}
