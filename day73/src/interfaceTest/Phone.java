package interfaceTest;


public class Phone implements PhoneInterface {

	@Override
	public void call(int tel) {
		System.out.println(tel + "에 전화걸기");
	}

	@Override
	public void sendMessage(String message, int tel) {
		System.out.println(tel + "에 " + message + "라고 메세지 보내기");
	}

	@Override
	public void photo() {
		System.out.println("사진찍기");
	}

}
