package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websol.notice.model.School;


@Controller
public class HomeWorkController {

	@RequestMapping(value="/homework",method=RequestMethod.GET)
	public String setcount(@ModelAttribute("bancount") Integer bancount,
			@ModelAttribute("stcount") Integer stcount)
	{
		return "homework/form";
	}
	
	@RequestMapping(value="/homework",method=RequestMethod.POST)
	public String submit(School sc)
	{
		
		sc.sort();
		return "homework/submit";
	}
}
