package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
	}
	
	@RequestMapping("one.do")
	public void name(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model속성을 이용하면 views아래까지 데이터를 보내고 사라진다.
		model.addAttribute("dto", dto);
	}
}
