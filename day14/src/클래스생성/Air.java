package 클래스생성;

public class Air {
	public String color;
	public int filter;
	public boolean remote;
	public String brand;
	
	public void on() {
		System.out.println("전원이 켜집니다.");
	}
	
	public void off() {
		System.out.println("전원이 꺼집니다.");
	}
	
	public void temp() {
		int tem = 0;
		System.out.println("온도가 " + tem + "도로 변경되었습니다.");
	}
}
