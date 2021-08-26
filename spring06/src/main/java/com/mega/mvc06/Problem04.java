package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요. ");
		try {
		//	System.out.println("2. 문제 발생 줄..~~~" + 10/0);
			FileWriter file = new FileWriter("/test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			System.out.println("파일에 쓰는 중 에러 발생...@@@@");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리함");
		} finally {
			//에러에 관계없이 반드시 꼭 실행
			System.out.println("예외처리 끝");
		}
		System.out.println("3. 나도 프린트 될까요. ");

	}

}
