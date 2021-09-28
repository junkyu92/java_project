package com.mega.mvc14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	@RequestMapping("del.do")
	public String del(MemberDTO memberDTO) {
		int result = dao.del(memberDTO);
		return "redirect:list.mega";
		
	}
	
	@RequestMapping("list.mega")
	public void list(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
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
	@RequestMapping("check2.mega")
	public void check2(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO);
		MemberDTO dto = dao.check2(memberDTO);
		String result = "사용가능";
		if(dto != null) {
			result = "중복";
		}
		model.addAttribute("result", result);
	}
}
