package 이차원배열;

public class 열이다른 {

	public static void main(String[] args) {
		// 1. 배열 처음에 만들 떄 값을 이미 알고 있는 경우
		int[][] n1 = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2. 배열 처음에 만들 때 값을 모르고 있는 경우
		int[] m0 = new int[3];
		int[] m1 = new int[4];
		int[] m2 = new int[5];
		
		int[][] n2 = new int[3][];
		n2[0] = m0;
		n2[1] = m1;
		n2[2] = m2;
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
