package com.mega.mvc06;

public class Problem06Main2 {

	public static void main(String[] args) {
		Problem06 error = new Problem06();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("알아서 처리 ");
		}
		System.out.println("에러 발생 후 실행될까요");
	}
}
	
	
	
	
	
	
	