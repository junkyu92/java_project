package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	
	public int del(MemberDTO dto) {
		int result = myBatis.delete("member.del", dto);
		return result;
	}
	
	public List<MemberDTO> list() {
		List<MemberDTO> list = myBatis.selectList("member.all");
		return list;
	}
	
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
	
	public MemberDTO check2(MemberDTO memberDTO) {
		MemberDTO dto = myBatis.selectOne("member.check2", memberDTO);
		return dto;
	}
}
