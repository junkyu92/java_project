package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));

		//일,월,화 날씨를 순서대로 입력해보세요.(흐림,맑음,흐림)
		//흐림이 몇개인지, 맑음이 몇개인지 세어보세요.
		//1. 스캐너로 입력받아서 
		//2. 스트링을 배열로 변환해서 넣으세요.
		//3. 카운트
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일,월,화 날씨를 순서대로 입력해보세요.>> ");
		String w = sc.next();
		String[] w1 = w.split(",");
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < w1.length; i++) {
			if (w1[i].equals("흐림")) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("흐림: " + count1);
		System.out.println("맑음: " + count2);
	}

}
