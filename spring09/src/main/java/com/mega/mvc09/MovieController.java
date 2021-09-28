package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String title, int price) {
		System.out.println(title);
		System.out.println(price);
		
		if(price >= 10000) {
			return "pay";
		}else {
			return "redirect:movie.jsp";
		}
	}
	
	@RequestMapping("pay.do")
	public void name() {
		dao.pay();
	}
}
