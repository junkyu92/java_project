package com.mega.mvctest;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SkiDAO {
	
	@Autowired
	SqlSessionTemplate hey;
	
	public void insert(SkiDTO dto) {
		hey.insert("ski.insert",dto);
	}
}