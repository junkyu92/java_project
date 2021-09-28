package com.mega.mvc08.casting;

import java.util.ArrayList;

import com.mega.mvc08.MemberDTO;
import com.mega.mvc08.box.BallPen;

public class Casting1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		MemberDTO dto = new MemberDTO();
		dto.setId("hong");
		list.add(dto);
		list.add("hong");
		list.add(100);
		list.add(11.11);
		
		MemberDTO dto2 = (MemberDTO)list.get(0);
		System.out.println(dto2.getId());
		
		int a = (int)list.get(2);
		double temp = (double)list.get(3);
		System.out.println(a + 1);
		System.out.println(temp + 100);
	}
}
