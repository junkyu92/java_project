package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMan sMan = new SuperMan();
		sMan.name = "park";
		sMan.age = 1000;
		sMan.power = 3000;
		sMan.fly = true;
		
		System.out.println(sMan);
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();
	}

}
