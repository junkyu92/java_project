package 배열사용;

import java.util.Scanner;

public class 인기투표복기 {

	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" };
		int[] tv = new int[3];
		int x = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("인기투표 ");
			for (int i = 1; i <= tv.length; i++) {
				System.out.print(i + ")" + name[i-1] + " ");
			}
			System.out.println(tv.length+1 + ")종료");
			System.out.print("선택번호>> ");
			int num = sc.nextInt();
			if (num == tv.length+1) {
				System.out.println("종료합니다.");
				System.out.println();

				System.out.println("투표결과");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				System.out.println("전체 투표수: " + x + "회");
				System.exit(0);
			} else if (1 <= num && num <= tv.length) {
			tv[num-1]++;
			x++;
			System.out.println(name[num-1] + "득표!");
			System.out.println();
			} else {
				System.out.println("잘못입력하셨습니다.");
				System.out.println();
			}
		}

	}// main

}// class
