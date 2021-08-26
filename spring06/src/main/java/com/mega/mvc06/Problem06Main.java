package com.mega.mvc06;

public class Problem06Main {

	public static void main(String[] args) {
		Problem06 error = new Problem06();
		try {
			error.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("에러 발생 후 실행될까요");
	}
}
	
	
	
	
	
	
	