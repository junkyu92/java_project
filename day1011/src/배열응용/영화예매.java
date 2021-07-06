package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		final int MONEY = 10000;
		
		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + (i));
			}
			System.out.println();
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(" " + seat[i]);
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			int no = sc.nextInt();
			if (no == -1) {
				System.out.println("예약 시스템 종료합니다.");
				System.out.println(count + "자리 예약되었습니다.");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			} 
			
			if (seat[no] != 1) {
				seat[no] = 1;
				System.out.println(no + "번 예약되었습니다.");
				count++;
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
			}
			System.out.println();
		}
		sc.close();
		
		//1. 예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음.
		//지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요.!
		
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println(count2 + "자리 예약되었습니다.");
		
		//2. 1로 예약된 자리가 어디인지 프린트
		String sum = "";
		String sum2 = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				//System.out.println(i + "번 자리 예약");
				sum = sum + i + "번 ";
			} else {
				sum2 = sum2 + i + "번 ";
			}
		}
		System.out.println("예약된 자리 목록 " + sum);
		System.out.println("예약안된 자리 목록 " + sum2);
	}
}
