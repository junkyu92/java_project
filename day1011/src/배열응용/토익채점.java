package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];
		
		Random r = new Random();
		
		int count = 0;
		
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1;
			내답[i] = r.nextInt(4) + 1;
		}
		
		System.out.println("번호	:	답안		내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.print(i + "	:	" + 답안[i] + "	<->	" + 	내답[i]);
			if (답안[i] == 내답[i]) {
				System.out.println("	O");
				count++;
			} else {
				System.out.println("	X");
			}
			
		}
		System.out.println(count + "점");
		
		//답안보다 내답이 더 큰 경우 몇 문제 카운트
		int count2 = 0;
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] < 내답[i]) {
				count2++;
			}
		}
		System.out.println("답안보다 내 답이 더 큰 경우 " + count2 + "번");
		
	}

}
