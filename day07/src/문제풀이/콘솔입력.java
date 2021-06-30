package 문제풀이;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이입력>> ");
		int a = sc.nextInt();
		System.out.println("내년 나이는 " + (a + 1) + "세");
		
		System.out.print("키를 입력>> ");
		double b = sc.nextDouble();
		System.out.println("내년 키는 " + (b + 10));
		
		System.out.print("저녁을 먹었는지 입력(true/false) >> ");
		boolean c = sc.nextBoolean();
		if (c) {							//c == true랑 c 이거 이해 잘 안감 질문!
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		sc.nextLine();
		System.out.print("올해의 목표는 >> ");
		String d = sc.nextLine();
		System.out.println("올해의 목표는 " + d + "!!!");
		
	}

}
