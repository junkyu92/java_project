package com.mega.mvc09;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false;
		if(dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}

	public void create() {
		
	}

	public void read() {
		
	}
	
	public void update() {
		
	}
}
