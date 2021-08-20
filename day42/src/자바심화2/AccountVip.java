package 자바심화2;

public class AccountVip extends Account{
double rate = 0.1;
	
	public AccountVip(String name, String num, int money) {
		this.name = name;
		this.num = num;
		this.money = money;
	}

	@Override
	public String toString() {
		return "[AccountVip " + ", name=" + name + ", num=" + num + ", money=" + money + "]";
	}
}
