package 배열응용;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("성적 입력>> ");
			jumsu[i] = sc.nextInt();
		}
		
		
	}

}
