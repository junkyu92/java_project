package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	//어노테이션 Annotation
public class BbsController{
	@RequestMapping("bbs.mega")
	public void bbs(BbsDTO bbsDTO, String date){
		System.out.println(bbsDTO);
		System.out.println(date);
	}
}
