package 그래픽문제;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] s = new int[3][5];
		//		0	1	2	3	4
		//0 	0	0	0	0	0
		//1		0	0	0	0	0
		//2		0	0	0	0	0
		s[1][1] = 1;
		s[1][2] = 1;
		s[1][3] = 1;
		s[2][4] = 1;
		System.out.println(s[1][1]);
		System.out.println(s[1][2]);
		System.out.println(s[1][3]);
		System.out.println(s[2][4]);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(s[i][j]);
			} 
			System.out.println();
		}
		//i = 0		s[0][0] s[0][1] s[0][2] s[0][3] s[0][4]
		//i = 1		s[1][0] s[1][1] s[1][2] s[1][3] s[1][4]
		//i = 2		s[2][0] s[2][1] s[2][2] s[2][3] s[2][4]
		
	}

}
