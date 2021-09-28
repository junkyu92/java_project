package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void create(PayDTO payDTO) {
		System.out.println(payDTO);
		my.insert("pay.insert", payDTO);
	}
	
	public PayDTO read(PayDTO payDTO) {
		System.out.println(payDTO);
		PayDTO dto = my.selectOne("pay.one", payDTO);
		return dto;
	}
}
