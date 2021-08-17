package 상속;

public class GiantBaby extends Baby{
	String weight;
	
	@Override
	public String toString() {
		return "GiantBaby [weight=" + weight + ", walking=" + walking + ", name=" + name + ", age=" + age + "]";
	}

	public void big() {
		System.out.println("크다.");
	}
}
