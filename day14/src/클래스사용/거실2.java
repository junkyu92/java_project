package 클래스사용;

import 클래스생성.Air;

public class 거실2 {

	public static void main(String[] args) {
		Air air1 = new Air();

		air1.brand = "whisen";
		air1.color = "white";
		air1.filter = 3;
		air1.remote = true;
		
		air1.on();
		air1.temp();
		air1.off();
	
	}

}
