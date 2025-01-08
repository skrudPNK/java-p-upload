package chapter02;

// 인터페이스
// 인터페이스의 모든 변수는 public static final 형태임
// 인터페이스의 모든 메서드는 public abstract 형태임
// 다중구현 가능

interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangelArea(double bottom, double height);
	public abstract double getRectangleArea(double bottom, double height);
	public abstract double getCircleArea(double radius);


}

interface NomalCalculation{
	public abstract double add(double a, double b);
}

// 인터페이스는 인터페이스끼리 확장(상속)이 가능함
// 인터페이스의 확장은 다중 상속이 가능함

// 인터페이스는 개발자간의 상호 약속을 위한 수단으로 사용됨
// 기능, 상수들에 대한 약속을 정의함

class Calculation implements AreaCalculation, NomalCalculation {
	


	@Override
	public double getTriangelArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	@Override
	public double getCircleArea(double radius) {
		double circleArea = radius*radius*PI;
		return circleArea;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		double rectangleArea = bottom * height;
		return rectangleArea;
	}

	@Override
	public double add(double a, double b) {
		double addResult = a + b;
		return addResult;
	}
	
}

public class I_Interface {
	
	public static void main(String[] args) {
		
	}

}
