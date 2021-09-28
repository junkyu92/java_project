package com.mega.mvc14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	@RequestMapping("bbs.all")
	public String all(Model model) {
		List<BbsDTO> list = dao.readAll();
		model.addAttribute("list", list);
		System.out.println(list);
		return "bbsall";
	}
	
	@RequestMapping("bbs.mega")
	public void create(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		dao.create(bbsDTO);
	}
	
	@RequestMapping("bbs.one")
	public String read(BbsDTO bbsDTO, Model model) {
		System.out.println(bbsDTO);
		BbsDTO dto = dao.read(bbsDTO);
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setBbsid(bbsDTO.getId());
		List<ReplyDTO> list = dao2.readAll(dto2);
		model.addAttribute("dto", dto);
		model.addAttribute("list", list);
		return "bbsone";
	}
	
}
