package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
		/*
		 * 랜덤한 값을 1~100
		 * 4*5에 넣으세요 
		 * 
		 * 전체 프린트
		 */

		Random r = new Random();
		int[][] n = new int[4][5];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = r.nextInt(100) + 1;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
