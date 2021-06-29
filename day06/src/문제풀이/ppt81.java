package 문제풀이;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ppt81 {

	public static void main(String[] args) {
		//구매금액: 5000
		//당신은 vip입니까? yes/no
		//구매금액이 3000원 이상이면 "감사합니다."
		//아니면 "다음에 더 많은 구매를 부탁드립니다."
		//vip이면 구매금액에서 1000원을 할인하여 결제
		//아니면 구매금액 모두 결제
		
		String c = JOptionPane.showInputDialog("구매금액");
		String vip = JOptionPane.showInputDialog("당신은 vip입니까? (yes/no)");
		
		int c1 = Integer.parseInt(c);
		
		if (c1 >= 3000) {
			System.out.println("감사합니다.");
		} else {
			System.out.println("다음에 더 많은 구매를 부탁드립니다.");
		}

		if (vip.equals("yes")) {
			System.out.println((c1 - 1000) + "원 결제");
		} else if (vip.equals("yes")) {
			System.out.println(c1 + "원 결제");
		} else{
			System.out.println("잘못 입력하셨습니다.");
		}
	
	
	}

}
