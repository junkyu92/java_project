package 문제풀이;

import java.util.Scanner;

public class 점수문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수(30%): ");
		double a = sc.nextInt() * 0.3;
		System.out.println("= " + a);

		System.out.print("속도 점수(50%): ");
		double b = sc.nextInt() * 0.5;
		System.out.println("= " + b);
		
		System.out.print("연비 점수(20%): ");
		double c = sc.nextInt() * 0.2;
		System.out.println("= " + c);
		
		System.out.println("----------------------------");
		
		double sum = a + b + c;
		if (sum >= 90) {
			System.out.println(sum + "점 최우수입니다.");
		} else if (sum >= 80) {
			System.out.println(sum + "점 우수입니다.");
		} else if (sum >= 70) {
			System.out.println(sum + "점 보통입니다.");
		} else {
			System.out.println(sum + "점 미달입니다.");
		}
		
	}

}
