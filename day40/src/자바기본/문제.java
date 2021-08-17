package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		System.out.print("식사인원이 몇명인지 입력하세요. >> ");
		int in2 = sc.nextInt();
		for (int i = 0; i < in2; i++) {
			System.out.print("각자 먹고싶은 점심메뉴를 입력하세요. >> ");
			String in1 = sc.next();
			list.add(in1);
		}
		for (String a : list) {
			if(a.equals("자장면")) {
				cnt1 += 1;
			}else if (a.equals("짬뽕")) {
				cnt2 += 1;
			}else{
				cnt3 += 1;
			}
		}
		
		System.out.println("\n자장면 " + cnt1 + "명");
		System.out.println("짬뽕 " + cnt2 + "명");
		System.out.println("기타 " + cnt3 + "명");
	}

}
