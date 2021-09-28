package com.mega.mvc14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("reply.add")
	public void name(ReplyDTO replyDTO) {
		System.out.println(replyDTO);
		dao.create(replyDTO);
	}
}
