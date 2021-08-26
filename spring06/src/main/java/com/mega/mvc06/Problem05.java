package com.mega.mvc06;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class Problem05 {
	public void call() {
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("에러 발생후 실행될까요");
		}

	}

}
	
	
	
	
	
	
	