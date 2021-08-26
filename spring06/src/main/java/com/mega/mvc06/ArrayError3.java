package com.mega.mvc06;

public class ArrayError3 {

	public static void main(String[] args) {
		ArrayError2 arr = new ArrayError2();
		try {
			arr.array();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 에러");
		} catch (Exception e) {
			System.out.println("다른 에러 발생@@@");
		} finally {
			System.out.println("배열에 문제가 사라지게 해결했어요");
		}
		System.out.println("아 배열 끝~~~");
	}
}
