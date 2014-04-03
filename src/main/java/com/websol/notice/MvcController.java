package com.websol.notice;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;

@Controller
@RequestMapping("/mvc/{cate1}/{cate2}/{cate3}")
public class MvcController {

	@ModelAttribute("log")
	public String log()
	{
		String res="login";
		return res;
	}
	
	@ModelAttribute("cate1")
	public List cate1()
	{
		List res = new ArrayList();
		res.add("회사소개");
		res.add("갤러리");
		res.add("고객센터");
		return res;
	}
	@ModelAttribute("cate2")
	public Object cate2(@PathVariable int cate2)
	{
		String[][] res={{"인사말","연혁","오시는길"},
				{"밍또","뽀스","반장","여왕"},
				{"공지사항","Q&A","FAQ"}};
		return res[cate2];
	}
	@ModelAttribute("cate3")
	public Object game(@PathVariable int cate1,@PathVariable int cate2,@PathVariable String cate3)
	{
		
		String res = cate1+"/"+cate2+"/"+cate3;
		
	
		return res;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String get()
	{
		return "mvc/template"; 
	}
	@RequestMapping(method=RequestMethod.POST)
	public String post()
	{
		
		return "mvc/template"; 
	}
}
