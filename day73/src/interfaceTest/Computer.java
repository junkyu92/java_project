package interfaceTest;

public class Computer implements ComputerInterface {

	@Override
	public void internet() {
		System.out.println("인터넷 실행");
	}

	@Override
	public void game() {
		System.out.println("게임 실행");
	}

	@Override
	public void coding() {
		System.out.println("이클립스 실행");
	}
}
