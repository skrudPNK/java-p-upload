package chapter02_sub;

// chapter02 package에 선언된 F_AccessModifier 클래스를 사용하기 위해
// import한 것
import chapter02.F_AccessModifier;

public class AccessModifierSub2 extends F_AccessModifier {

	void method() {
	
		// cd: 다른 패키지의 상속받은 하위 클래스
		// public, protected 접근 제어자는 접근 가능
		super.publicInt = 0;
		super.protectedint = 0;

		// package, private 접근제어자는 접근 불가
//		super.defaltInt = 0;
//		super.privateInt = 0;
//	}
}

class AccesModifier3 {
	
	void method() {
		F_AccessModifier instance = new F_AccessModifier();
		
		// cd : 다른 패키지의 관련 없는 클래스
		// public 접근제어자는 접근 가능
		instance.publicInt = 0;
		
		// protected, package, private 접근제어자는 접근 불가
//		instance.protectedInt = 0;
//		instance.defaltInt = 0;
//		instance.privateInt = 0;
	}
}}
