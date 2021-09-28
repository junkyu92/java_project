package com.mega.mvc07.test;

public class SingleObject2 {
	static int count;
	static SingleObject2 object;
	
	private SingleObject2() {
		System.out.println("객체 생성됨");
		count++;
	}
	
	//싱글톤은 객체를 하나만 만들고, 더이상 만들지 않는 방법
	public static SingleObject2 getInstance() {
		if(object == null) {
			object = new SingleObject2();
		}
		return object;
	}
}
