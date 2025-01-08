package chapter01;

import java.awt.KeyboardFocusManager;
import java.util.Scanner;

public class B_IO {

	public static void main(String[] args) {
		
		// 콘솔출력: System.out.print() / System.out.println()
		// 콘솔입력: 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("입력 : ");
		final int NUMBER = keyboard.nextInt();
		System.out.println(NUMBER);
		
		// 시스템으로부터 받은 자원 반환
		keyboard.close();
	}

}
