package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 최소값구하기2 {

	public static void main(String[] args) {
		/*
		 * 1~10000까지의 값을 랜덤하게 1000개 만들어서
		 * 1.최소값
		 * 2.개수
		 * 3.위치값
		 */
		Random r = new Random(100);
		int[] n = new int[10000];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000) + 1;
		}
		int min = n[0];
		for (int i = 1; i < n.length; i++) {
			if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.println("1. " + min);
		
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == min) {
				count++;
			}
		}
		System.out.println("2. " + count);
		
		System.out.print("3. ");
		String s = "";
		for (int i = 0; i < n.length; i++) {
			if (n[i] == min) {
				System.out.print(i + " ");
				s = s + i + " ";
			}
		}
		
		System.out.println("\n3. " + s);
		
		//파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(n);
		System.out.println(n[0]);
		System.out.println(n[n.length-1]);
		
	}

}
