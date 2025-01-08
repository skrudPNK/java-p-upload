package chapter01;

public class G_For_While {

	public static void main(String[] args) {
		// 반복문: 특정 조건을 만족하는 동안 지정한 코드 블럭을 반복
		
		for(int i = 1; i <10; i++) {
			
			System.out.print(i); System.out.println("단");
			for(int j = 1; j <10; j++) {
				
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result); 
			}
			System.out.println();
		}
		
		String[] fruits = new String[] {"apple", "banana", "cherry"};
		
		for(int i = 0; i < fruits.length; i++) {
			
			System.out.println(fruits[i]);
		}
		
		
		// forEach문 (향상된 for문) : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사해서 사용하는 반복문
		// 컬렉션의 실제 요소에 대해서 읽기 전용 작업에 적합
		// 변경하는 작업을 수행할 때는 적합하지 않음
		for(String i : fruits) {
			i += " add"; 
		}
		
		for(String i : fruits) {
			System.out.println(i);
		}
		
 
	}

}
