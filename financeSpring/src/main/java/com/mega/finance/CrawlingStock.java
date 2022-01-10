package com.mega.finance;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrawlingStock {
	
	@Autowired
	FinanceDAO dao;
	
	public void crawl(String code) {
		String url = "https://finance.naver.com/item/main.naver?code=" + code;
		
		try {
			Document doc = Jsoup.connect(url).get();
			String company = doc.select("h2 > a").text();
			
			String yesterdayString = doc.select("td.first > em > span.blind").get(0).text();
			int yesterday = Integer.parseInt(yesterdayString.replace(",", ""));
			
			String todayString = doc.select("p.no_today > em.no_up > span.blind").text();
			int today = Integer.parseInt(todayString.replace(",", ""));
			
			String highString = doc.select("td.first+td > em.no_up > span.blind").text();
			int high = Integer.parseInt(highString.replace(",", ""));
			
			FinanceVO vo = new FinanceVO(today, yesterday, high, company, code);
			dao.insert(vo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
