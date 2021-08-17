package 상속;

public class Man extends Person{
	
	int power;
	public void run() {
		System.out.println("빨리 달리다. ");
	}
	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
