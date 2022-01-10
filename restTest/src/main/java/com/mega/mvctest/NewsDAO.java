package com.mega.mvctest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NewsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insertNews(NewsDTO dto) {
		my.insert("news.insert", dto);
	}
}
