package com.mega.mvc07.test;

public class SingleUser21 {

	public static void main(String[] args) {
		//SingleObject2 single2 = new SingleObject2();
		SingleObject2 single2 = SingleObject2.getInstance();
		System.out.println("주소: " + single2);
		System.out.println(SingleObject2.count + "개");
	}
}
