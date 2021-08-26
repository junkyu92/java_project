package com.mega.mvc03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping("in.mega")
	public void insert(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출된....");
		System.out.println("컨트롤러에서 받은 id " + dto.getId());
		System.out.println("컨트롤러에서 받은 pw " + dto.getPw());
		System.out.println("컨트롤러에서 받은 name " + dto.getName());
		System.out.println("컨트롤러에서 받은 tel " + dto.getTel());
	}
	
	@RequestMapping("check.mega")
	public void getList(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		dao.login(dto);
	}
	
	}
	

