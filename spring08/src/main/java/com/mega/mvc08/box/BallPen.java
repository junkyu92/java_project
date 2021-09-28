package com.mega.mvc08.box;

public class BallPen extends Product{
	int size;
	public void write() {
		System.out.println("볼펜으로 글을 쓰다");
		
	}
	@Override
	public String toString() {
		return "BallPen [size=" + size + ", price=" + price + ", company=" + company + "]";
	}
}
