package com.mega.mvc07.test;

public class One2 {
	static One2 object;
	public static One2 getInstance() {
		if(object == null) {
			object = new One2();
		}
		return object;
	}
}
