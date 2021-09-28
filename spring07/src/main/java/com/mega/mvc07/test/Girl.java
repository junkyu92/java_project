package com.mega.mvc07.test;

public class Girl {
	String name;
	int age;
	static int age2;
	static int count;
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		age2 += age;
		count++;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	
}
