package 배열사용;

import java.util.Scanner;

public class 인기투표100 {

	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" };
		int[] tv = new int[3];

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("인기투표 0)" + name[0] + " 1)" + name[1] + " 2)" + name[2] + " 3)종료");
			System.out.println("선택번호>> ");
			int num = sc.nextInt();
			if (num == 3) {
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				System.exit(0);
			}

			tv[num]++;

			System.out.println(name[num] + "표 득표");

		} // while

	}// main

}// class
