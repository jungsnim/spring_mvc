package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllExcepController {

	@RequestMapping("excep/allcontainer")
	public ModelAndView make(@RequestParam("id")String id,
			@RequestParam("jum")int jum)
	{
		//에러발생을 위한 처리
		//id=id.toLowerCase();
		System.out.println("id:"+id);
		
		int intId = Integer.parseInt(id);
		int a = 3/jum;
		System.out.println("jum: " + jum);
		ModelAndView mav = new ModelAndView("excep/allcontainer");
		mav.addObject("id", id);
		mav.addObject("jum", jum);
		return mav;
	}
	
	
}
