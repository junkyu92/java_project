package 문제풀이;

import java.util.Scanner;

public class 스트링3개입력 {

	public static void main(String[] args) {
		//String 변수는 원래 주소가 들어가있지만,
		//내부적으로 그 주소가 가르키는 char들을 프린트되도록 조정이 되어있는 상태임.
		
		String[] a = new String[3];
		//자동초기화 {null, null, null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("입력>> ");
			a[i] = sc.next();
		}
		System.out.println(a[0] + "보다는 " + a[1]);
		sc.close();
	}

}
