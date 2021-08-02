package 생성자;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone("white", "galaxy s22");
		Phone p2 = new Phone("black", "iPhone14");
		
		System.out.println("엄마폰: " + p1);
		System.out.println("아빠폰: " + p2);
	}

}
