package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		Boy2 boy1 = Boy2.getInstance();
		Boy2 boy2 = Boy2.getInstance();
		System.out.println(Boy2.count);
	}
}
//22. 객체가 계속 생성되므로 서버가 과부화됨
//23. 싱글톤은 기능을 사용하기 위함
//    DTO는 데이터를 저장하는 용도이기 때문에 각각의 DTO에 각각의 데이터가 들어간다.(쓰고 버려)