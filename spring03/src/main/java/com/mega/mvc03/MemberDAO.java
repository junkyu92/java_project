package com.mega.mvc03;

public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
	
	public void login(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
	}
}
