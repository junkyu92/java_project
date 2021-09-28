package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false;
		if(dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}

	public void create(MemberDTO memberDTO) {
		myBatis.insert("member.create", memberDTO);
	}

	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = myBatis.selectOne("member.one", memberDTO);
		return dto;
	}
	
	public void update() {
		
	}
}
