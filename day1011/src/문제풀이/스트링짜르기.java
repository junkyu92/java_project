package 문제풀이;

import java.util.Scanner;

public class 스트링짜르기 {

	public static void main(String[] args) {
		/*
		 * 전화번호 입력>> 011-245-1234 
		 * 1)양쪽 공백을 제거하시오. 
		 * 2)-을 기준으로 분리해내세요.(String[]) 
		 * 3)첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple 
		 * 4)두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰 
		 * 5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호 
		 *                         아니면 유효하지 않은 전화번호
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("전화번호 입력>> ");
		String p = sc.next();
		String p1 = p.trim();
		String[] p2 = p1.split("-");

		if (p2[0].equals("011")) {
			System.out.println("SK");
		} else if (p2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if (p2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		String p3 = p1.replace("-", "");
		
		if (p3.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		sc.close();
	}

}
