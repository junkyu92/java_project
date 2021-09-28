package com.mega.mvc08.box;

public class BallPenMain {

	public static void main(String[] args) {
		BallPen p1 = new BallPen();
		p1.company = "mega";
		p1.price = 1000;
		p1.size = 10;
		p1.buy();
		p1.write();
		System.out.println(p1);
	}

}
