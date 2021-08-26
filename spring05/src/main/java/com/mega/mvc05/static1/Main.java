package com.mega.mvc05.static1;

public class Main {

	public static void main(String[] args) {
		Em a1 = new Em("홍길동", '남', 25);
		Em a2 = new Em("김길동", '여', 26);
		Em a3 = new Em("송길동", '남', 27);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Em.count);
		System.out.println(Em.ageAvg);
	}
}
