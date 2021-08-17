package 상속;

public class SuperMan extends Man{
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날아다니다.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
