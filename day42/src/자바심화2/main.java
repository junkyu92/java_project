package 자바심화2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<Account>();
		  while (true) {
			System.out.print("만들 계좌의 등급을 선택하세요 >> ");
			int level = sc.nextInt();
			if (level == 1) {
				//AccountNormal n = new AccountNormal()
				System.out.print("이름을 입력해주세요 >> ");
				String name = sc.next();
				System.out.print("계좌번호를 입력해주세요 >> ");
				String num = sc.next();
				System.out.print("금액을 입력해주세요 >> ");
				int money = sc.nextInt();

				AccountNomal n1 = new AccountNomal(name, num, money);
				list.add(n1);
			} else if (level == 2) {
				//AccountVip v = new AccountVip()
				System.out.print("이름을 입력해주세요 >> ");
				String name = sc.next();
				System.out.print("계좌번호를 입력해주세요 >> ");
				String num = sc.next();
				System.out.print("금액을 입력해주세요 >> ");
				int money = sc.nextInt();

				AccountVip v1 = new AccountVip(name, num, money);
				list.add(v1);
			} else if (level == 3) {
				break;
			} else {
				System.out.println("숫자 1,2만 입력해주세요");
			} 
			System.out.println(list + "\n");
		}
		  
		System.out.println("계좌번호를 입력해주세요 >> ");
		String num = sc.next();
		System.out.println("입금할 금액을 입력해주세요 >> ");
		int money = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if(num.equals(list.get(i).num)){
				list.set list.get(i).money + money;
			}
		}
		
	}
}
