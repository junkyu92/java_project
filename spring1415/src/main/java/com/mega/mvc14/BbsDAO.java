package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<BbsDTO> readAll() {
		List<BbsDTO> list = my.selectList("bbs.all");
		System.out.println(list);
		return list;
	}
	
	public void create(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		my.insert("bbs.add", bbsDTO);
	}

	public BbsDTO read(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		BbsDTO dto = my.selectOne("bbs.one", bbsDTO);
		System.out.println(dto);
		return dto;
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}
