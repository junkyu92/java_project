package 자바기본;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = { 0, 0, 0, 0, 0};
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요?");
			String temp = sc.next();
			int temp1 = Integer.parseInt(temp);
			if (temp1 >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요!");
			} 
			jumsu[i] = temp1;
			sum = sum + temp1;
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		System.out.println("-------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i] + " ");
		}
		sc.close();
	}
}
