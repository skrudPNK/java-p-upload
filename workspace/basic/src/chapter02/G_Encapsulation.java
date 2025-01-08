package chapter02;


// 캡슐화 : 인스턴스 필드와 메서드를 하나로 묶어서 필드에 대한 조작을
// 정보 은닉, 데이터 보호, 데이터 무결성을 보장할 수 있음

// Entity: 데이터베이스의 레코드를 관리 (생성자와 getter만 유지)
// DTO(Data transfer Object): 데이터 전송을 위한 객체 (불변성: 생성자와 getter만 유지 / 가변성: 생성자와 getter, setter 모두 유지_
// VO (Valud Object): 값을 표현하는 객체 (생성자와 getter만 유지, Object 클래스의 equals() 메서드를 오버라이딩해서 사용)



class Player {
	private String name;
	private String team;
	private String birth;
	private int number; 
	
	Player (String name, String team, String birth, int number){
		this.name = name;
		this.team = team;
		this.birth = birth;
		this.number = number < 0 ? 0 : number;
	}
	
	// getter 메서드 : 캡슐화에서 private 필드의 값을 반환하는 메서드
	String getName() {
		return this.name;
	}
	
	String getTeam() {
		return this.team;
	}
	
	String getBirth() {
		return this.birth;
	}
	
	int getNumbr() {
		return this.number;
	}
	
	// setter 메서드 : 캡슐화에서 private 필드의 값을 변경하는 메서
	
}


public class G_Encapsulation {

	public static void main(String[] args) {
		
		Player player1 = new Player("이성계", "조선", "1335-11-04", 1);
		System.out.println(player1.getName() + " " + player1.getTeam() + " " + player1.getBirth()
							+ " " + player1.getNumbr());
		
	}

}
