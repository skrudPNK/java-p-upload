package chapter01;

import java.util.Scanner;

public class E_IfElse {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		
		if (number > 0) System.out.println("양수");
		else if (number < 0) System.out.println("음수");
		else System.out.println("0"); //이렇게만 해도 되는구나....... 이건 좀 신기

		System.out.println("여러 조건 종료");
		
		String country = "대한민국";
		int age = 23;
		String gender = "남성";

//		if(
//				country.equals("대한민국") && 
//				age > 19 && 
//				gender.equals("남성")
//		) {
//			
//			System.out.println("현역");
//			
//		}
//		System.out.println("종료");
		
		boolean isActive = 
				country.equals("대한민국") && 
				age > 19 && 
				gender.equals("남성");
				
		if(!isActive) return;
        System.out.println("현역");
		
		System.out.println("종료");
	}

}
