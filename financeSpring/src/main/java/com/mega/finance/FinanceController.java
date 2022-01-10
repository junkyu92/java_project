package com.mega.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FinanceController {

	@Autowired
	FinanceDAO dao;
	
	@Autowired
	CrawlingStock crawling;
	
	@RequestMapping("create.finance")
	public void name(FinanceVO financeVO) {
		dao.insert(financeVO);
	}
	
	@RequestMapping("create.finance2")
	@ResponseBody
	public String name2(FinanceVO financeVO) {
		dao.insert(financeVO);
		return "success!";
	}
	
	@RequestMapping("crawling.code")
	public void name3(String code2) {
		crawling.crawl(code2);
	}
	
	@RequestMapping("crawling.code2")
	@ResponseBody
	public String name4(String code) {
		crawling.crawl(code);
		return "success!";
	}
}
