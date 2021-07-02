package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] jumsu = new int[100];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101);
		}
		for (int i : jumsu) {
			System.out.println(i);
		}
		
	}

}
