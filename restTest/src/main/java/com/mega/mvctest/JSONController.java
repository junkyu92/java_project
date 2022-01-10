package com.mega.mvctest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
	
	@Autowired
	SkiDAO dao;
	
	@Autowired
	NewsDAO dao2;
	
	@RequestMapping("jsonResponse1")
	@ResponseBody
	public BookBag json1() {
		BookBag bag = new BookBag();
		bag.setId("naver");
		bag.setName("naver");
		bag.setUrl("http://www.naver.com");
		bag.setImg("resources/img/car.png");
		return bag;
	}
	
	@RequestMapping("dbGo")
	@ResponseBody
	public void dbGo(SkiDTO skiDTO) {
		dao.insert(skiDTO);
		System.out.println(skiDTO
				);
	}
	
	@RequestMapping("jsonResponse2")
	@ResponseBody
	public List<BookBag> json2() {
		List<BookBag> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BookBag bag = new BookBag();
			bag.setId("naver" + i);
			bag.setName("naver" + i);
			bag.setUrl("http://www.naver.com");
			bag.setImg("resources/img/car.png");
		}
		return list;
	}
	
	@RequestMapping("newsDb")
	@ResponseBody
	public void name(NewsDTO newsdto) {
		dao2.insertNews(newsdto);
	}
}
