package chapter02;

// 접근제어자
// public : 모든 패키지에서 접근 가능
// protected : 같은 패키지 내부, 혹은 외부 패키지의 자손 클래스에서 접근 가능
// defalt : 같은 패키지 내부에서만 접근 가능
// private : 같은 클래스 내부에서 접근 가능


// The public type ExampleClass must be defined in its own file
// 특정 클래스파일(.java 파일)에서 public 클래스는
// 파일명과 일치해야 하고 하나만 지정할 수 있음


//public class ExampleClass {
//	
//}
//                                                               
//class AccessModifierSub1 {
//	
//	void method() {
//		
//		F_AccessModifier instance = new F_AccessModifier();
//		
//		instance.publicInt = 0;
//		instance.protectedint = 0;
//		instance.defaltInt = 0;
//		
//		instance.privateInt;
//	}
//}


public class F_AccessModifier {

	public int publicInt;
	protected int protectedint;
	int defaltInt;
	private int privateInt;
	
	public static void main(String[] args) {
		

	}

}
