package 배열생성;

import java.util.Random;

public class 문자배열 {

	public static void main(String[] args) {
		// 1.int크기 5인 배열을 생성
		// 2.배열의 크기 프린트
		// 3.배열의 첫번째 위치에 100을 넣어서 프린트
		// 4.배열의 마지막 위치에 500을 넣어서 프린트
		// 5.배열의 3번째 위치에 200을 넣어서 프린트
		// 6.배열의 전체데이터를 프린트
		// 7.배열의 전체데이터를 인덱스와 함께 프린트
		// 8.그림으로 그려보세요

		// 1.
		int[] x = new int[5];
		
		// 2.
		System.out.println(x.length);

		// 3.
		x[0] = 100;
		System.out.println(x[0]);
		
		// 4.
		x[x.length-1] = 500;
		System.out.println(x[x.length-1]);
		
		// 5.
		x[2] = 200;
		System.out.println(x[2]);
		
		// 6.
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		// 7.
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + " : " + x[i]);
		}
		
	}

}
