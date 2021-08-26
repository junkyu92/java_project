package com.mega.mvc05.static1;

public class Em {
	String name;
	char sex;
	int age;
	static int count;
	static int ageSum;
	static float ageAvg;
	public Em(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		count++;
		ageSum += age;
		ageAvg = (float)ageSum/count;
	}

	@Override
	public String toString() {
		return "Em [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
