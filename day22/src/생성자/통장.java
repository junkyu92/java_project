package 생성자;

public class 통장 {
	String name;
	String ssn;
	int money;
	
//	public 통장() {
//		//입력값이 없는 생성자 -> 기본생성자
//		//default constructor
//		//다른 생성자가 하나도 없으면 자동 생성
//		//묵시적으로 만들어졌음.
//	}
	
	
	
	public 통장(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}



	public void 입금() {
		System.out.println("입금하다.");
	}
	
}
