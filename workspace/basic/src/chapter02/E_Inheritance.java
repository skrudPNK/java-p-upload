package chapter02;

// 상속해서 오히려 유지보수성이 낮아질 수도 있다는 단점 존재
// 자바의 모든 클래스는 Object 클래스를 최상위 클래스로 상속받아 사용함


class Human{
	
	String name;
	int age;
	
	// 부모 클래스의 생성자는 상속되지 않음
//	Human(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
	void sleep() {
		System.out.println(name + "이(가) 잠을 잔다");
	}
	
	final void eat() {
		System.out.println("밥찵여");
	}
}

class SalesMan extends Human {
	
	@Override
	void sleep() {
		System.out.println("영업사원이 잠을 잔다");
		super.sleep();
	}
	
//	void eat() {
//		
//	} 아 파이널 메소드는 오버라이딩을 못하는군아~
}

class Police extends Human  {
	
//	Police(String name, int age) {
//		super(name, age);
//	}

	String rank;
	
	void patrol() {
		System.out.println("순찰을 한다");
	}
	
	// super()
	// super.
	Police(){
		super.name = "이항";
		age = 23;
		rank = "경감";
		super.sleep();
	}
	
}

// 자바에서는 단일상속만 지원
// : 다중 상속에 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기 위함
//   *다이아몬드 문제: 다중 상속으로 인해 동일한 이름의 메서드를 상속받은 상테에서 어떤 메소드를 선택해야할지 모호해지는 상태 
// 인터페이스 혹은 중첩상속을 이용해 다중 상속 효과를 받을 수 있음
class Firefighter extends Human {
//	
//	Firefighter(String name, int age) {
//		super(name, age);
//	}

	String position;
	
	void fireFight() {
		System.out.println("소방활동을 한다");
	}
	

	// Human 클래스에서 상속받은 sleep 메서드를 오버로딩한 것
	void sleep(int time) {
		System.out.println(name + "이 " + time +"시에 잠을 잔다.");
	}
}


final class FinalSuper {
	int a;
	
}

//class FinalSub extends FinalSuper {} : final로 정의된 클래스는 상속받을 수 없다

// @(어노테이션)Override 컴파일러에게 현재 작업이 오버라이딩 작업임을 알려줌

public class E_Inheritance {

	public static void main(String[] args) {
		
		Firefighter firefighter = new Firefighter();
		firefighter.name = "이도";
		firefighter.sleep(22);

	}

}
