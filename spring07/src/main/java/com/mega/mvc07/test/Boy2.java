package com.mega.mvc07.test;

public class Boy2 {
	static Boy2 object;
	static int count;
	public static Boy2 getInstance() {
		if(object == null) {
			object = new Boy2();
			count++;
		}
		return object;
	}
}
