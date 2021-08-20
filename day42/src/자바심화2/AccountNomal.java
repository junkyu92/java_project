package 자바심화2;

public class AccountNomal extends Account {
double rate = 0.01;
	
	public AccountNomal(String name, String num, int money) {
		this.name = name;
		this.num = num;
		this.money = money;
	}
	public void in(String num, int money) {
	}
	@Override
	public String toString() {
		return "[AccountNomal " + ", name=" + name + ", num=" + num + ", money=" + money + "]";
	}
}
