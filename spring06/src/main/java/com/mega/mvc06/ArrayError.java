package com.mega.mvc06;

public class ArrayError {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			num[3] = 4;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 에러!!");
		} catch (Exception e) {
			System.out.println("다른 에러 발생@@@");
		} finally {
			System.out.println("배열에 문제가 사라지게 해결했어요");
		}
		System.out.println("아 배열 끝~~~");
	}
}
