package com.mega.mvc06;

import java.io.FileWriter;

public class Problem03 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요. ");
		try {
			//System.out.println("2. 문제 발생 줄..~~~" + 10/0);
			FileWriter file = new FileWriter("/test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("3. 나도 프린트 될까요. ");

	}

}
