package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayController {
	
	@Autowired
	PayDAO dao;
	
	@RequestMapping("pay.do")
	public void create(PayDTO payDTO) {
		System.out.println(payDTO);
		dao.create(payDTO);
	}
	
	@RequestMapping("pay.one")
	public String read(PayDTO payDTO, Model model) {
		System.out.println(payDTO);
		PayDTO dto = dao.read(payDTO);
		model.addAttribute("dto", dto);
		return "payone";
	}
}
