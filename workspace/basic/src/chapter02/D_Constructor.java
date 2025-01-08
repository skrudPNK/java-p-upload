package chapter02;

class Human1 {
	
	String name;
	int age;
	String gender;
	
	// final로 선언된 인스턴스변수는 생성자에서 반드시 초기화 해야한다
	// = 필수값
	final String adress;
	
	Human1(){
		System.out.println("Human1의 인스턴스가 생성됩니다.");
		
		// 2. 인스턴스 생성과 동시에 초기화
		// 의존성을 내부에서 주입
		name = "홍길동";
		age = 40;
		gender = "남"; // 복잡해지면 그닥 좋지 않은 행위이다
		adress = "한국";
	}
	
	Human1(String name1, int age1, String gender1, String adress1){
		//의존성을 모두 외부에서 주입 > 가장 많이 사용
		name = name1;
		age = age1;
		gender = gender1;
		adress = adress1;
	}
	
	//권장됨
	Human1(Human1 human1){
		name = human1.name;
		age = human1.age;
		gender = human1.gender;
		adress = human1.adress; 
	}
	
	
}


public class D_Constructor {

	public static void main(String[] args) {
		
		// 클래스에 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자 제공
		Human1 human1 = new Human1();
		
		human1.name = "이성계";
		human1.age = 60;
		human1.gender = "남";
		
		Human1 human4 = new Human1("이방과", 30, "여", "미국");
		System.out.println(human4.name);
		System.out.println(human4.age);
		System.out.println(human4.gender);
		
		// 주소만 복사된 형태 (비독립적)
		Human1 human5 = human4;
		// 새로운 주소를 생성해서 값을 복사 (독립적)
		Human1 human6 = new Human1(human4);
		
		// 얕은 복사 - 원복 객체와 복사된 개체가 같은 개체를 참조하는 경우. 
		// 원본 객체가 변경 가능한 객체인 경우 문제가 될 수 있다.
		
		

	}

}
