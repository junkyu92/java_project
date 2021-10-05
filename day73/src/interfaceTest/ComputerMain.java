package interfaceTest;

public class ComputerMain {

	public ComputerMain() {
		Computer AppleComputer = new Computer();
		Computer BananaComputer = new Computer();
		
		AppleComputer.game();
		BananaComputer.coding();
	}
	public static void main(String[] args) {
		new ComputerMain();
	}
}
