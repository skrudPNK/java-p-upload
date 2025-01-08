package chapter02;

// 오버로딩:  같은 클래스 내에서 동일한 이름의 메서드를 여러개 만들 수 있는거
// 오버라이딩: 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것 
// 업캐스팅: 하위 클래스의 객체를 상위 클래스 혹은 구현한 인터페이스의 타입의 참조변수로 저장하는 것
// 다운캐스팅: '업캐스팅된' 객체를 다시 원래 타입의 변수에 담는 것

class People {
	String name;
	int age;
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Teacher extends People {
	
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	String subject;
	
}

class Student extends People {

	Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	int grade;
	
}

public class J_Polymorphism {

	public static void main(String[] args) {

		People people1 = new People("이성계", 20);
		Teacher teacher1 = new Teacher("이방과", 30, "역사");
		Student student1 = new Student("이방원", 15, 3);
		
		// 업캐스팅
		People people2 = teacher1;
		System.out.println(people2.name);
		System.out.println(people2.age);
		
		// 다운캐스팅
		Teacher teacher2 = (Teacher) people2;
		
		// Object를 활용한 업캐스팅 다운캐스팅
		Object object1= student1;
		Student student2 = (Student) object1;
		
	}

}
