package 상속;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		manager.address = "인천";
		manager.bonus = 300;
		manager.name = "kim";
		manager.rrn = 92121351;
		manager.salary = 68451685;
		System.out.println(manager);
		manager.test();
	}

}
