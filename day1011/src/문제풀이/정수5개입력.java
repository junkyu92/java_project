package 문제풀이;

import java.util.Scanner;

public class 정수5개입력 {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자입력>> ");
			
			a[i] = sc.nextInt();
		}
		
		System.out.println(a[0] + a[2]);
		sc.close();//스트림(연결통로)를 닫아라!
	}

}
