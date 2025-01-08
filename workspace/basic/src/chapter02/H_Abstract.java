package chapter02;

// 추상메서드: 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 

// abstract: 추성 클래스 혹은 추상 메서드를 정의하는 제어자
// abstract가 붙은 클래스는 인스턴스 생성이 불가하며 메서드는 구현부를 가질 수 없음

abstract class Occupatuion {
	int annual;
	int income;
	
	// 추상메서드는 하위 클래스에서 오버라이딩을 강요함
	abstract void work();
	
	// 추상클래스도 일반 메서들르 가질 수 있으나
	// 일반메서드는 오버라이딩을 강요하지 않음
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	// 추상클래스에서 생성자는 인스턴스를 생성하려는 목적이 아님
	// 하위 클래스에서 호출하여 사용할 수 있도록 제공하는 목적
	// 단, 기본 생성자가 없는 상태에서 생성자를 정의한다면 하위 클래스에 생성자 작성을 강요함
	public Occupatuion(int annual, int income) {
		this.annual = annual;
		this.income = income;
	}
}


class Developer extends Occupatuion{
	
	Developer(int annual, int income) {
		super(annual, income);
	}

	String position;
	
	void work() {
		System.out.println("프로그램을 개발한다");
	}
	
	void eat(String food) {
		System.out.println(food + "을 먹다");
	}
}

class TourGuide extends Occupatuion{
	
	TourGuide(int annual, int income) {
		super(annual, income);
	}

	String contry;

	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	
	void sleep() {
		System.out.println("관광지에서 잠을 잔다");
	}
	
}

public class H_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// 제어자 조합
// static이 붙은 변수: public + static + final (자주 사용)
// private + final 변수 : 생성자에서 필수로 초기화함을 의미
// private + final 메서드 : final이 의미가 없음
// private + abstract 메서드 : 불가능
// final + abstract 클래스와 메서드 : 불가능





