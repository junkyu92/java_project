package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<ReplyDTO> readAll(ReplyDTO replyDTO) {
		List<ReplyDTO> list = my.selectList("reply.all", replyDTO);
		System.out.println(list);
		return list;
	}
	
	public void create(ReplyDTO replyDTO) {
		System.out.println(replyDTO);
		my.insert("reply.add", replyDTO);
	}

	
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}
