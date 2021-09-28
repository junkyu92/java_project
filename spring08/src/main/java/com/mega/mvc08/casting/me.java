package com.mega.mvc08.casting;

import java.awt.List;
import java.util.ArrayList;

public class me {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		//int -오토박싱-> Integer -업캐스팅-> Object
		me.add(189.1);
		//double -오토박싱-> Double -업캐스팅-> Object
		me.add(false);
		//boolean -오토박싱-> Boolean -업캐스팅-> Object
		me.add('남');
		//char -오토박싱-> Char -업캐스팅-> Object
		System.out.println(me);
		
		int money = (int)me.get(0);
		//int <-오토언박싱- Integer <-다운캐스팅- Object
		System.out.println(money + 1000);
		
		double height = (double)me.get(1);
		//double <-오토언박싱- Double <-다운캐스팅- Object
		System.out.println(height + 10);

		boolean meal = (boolean)me.get(2);
		//boolean <-오토언박싱- Boolean <-다운캐스팅- Object
		if(meal) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		char sex = (char)me.get(3);
		//char <-오토언박싱- Char <-다운캐스팅- Object
		if (sex == '남') {
			System.out.println("주민번호는 1,3이에요");
		}else {
			System.out.println("주민번호는 2,4이에요");
		}
	}

}
