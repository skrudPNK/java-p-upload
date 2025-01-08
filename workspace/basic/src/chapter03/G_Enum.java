package chapter03;

import java.time.LocalDateTime;

// 열거형(Enum): 서로 관련된 상수들의 집합을 나타내는 특수한 클래스
// enum 열거형타입이름 {상수 . . . }

enum Color1 {
	//지정하고자 하는 상수를 콤마로 나열
	RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE
	
}

// 기획 후 개발시 약속해두는 용도
// 다른 값으로 변경되면 안됨. 캡슐화가 필요함
enum Color2 {
	RED("#FF0000", "rgb(255, 0, 0)"), 
	GREEN("#00FF00", "rgb(0, 255, 0)"), 
	BLUE("#0000FF", "rgb(0, 0, 255)");
	
	// 열거형도 클래스이기 때문에 필드, 메서드를 가질 수 있음
	// enum의 필드는 상수로 사용되기 때문에 변경되면 안됨
	// 캡슐화 작업이 필요함
	private final String hex;
	private final String rgb;
	
	// 인스턴스를 외부에서 생성하지 못하게 막는 것
	private Color2(String hex, String rgb) {
		this.hex = hex;
		this.rgb = rgb;
	}
	
	public String getHex() {
		return hex;
	}
	
	public String getRgb() {
		return rgb;
	}
}

public class G_Enum {

	public static void main(String[] args) {
		
		Color1 color1 = Color1.RED;
		System.out.println(color1);
		
		if (color1 == Color1.RED ) {
			System.out.println("빨간색");
		}
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

	}

}
