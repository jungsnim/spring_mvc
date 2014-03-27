package com.websol.notice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websol.notice.model.Stud;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("path/{kind}/{main}/{service}")
public class PathController {
	
	
	@ModelAttribute("mainMenu")
	public List main()
	{
		List res = new ArrayList();
		res.add("1학년");
		res.add("2학년");
		res.add("3학년");
		return res;
	}
	@ModelAttribute("subMenu")
	public Object sub(@PathVariable int kind)
	{
		String[][] res={{"소나리반","닭나리반"},
				{"송아지반","망하지반","안망하지반"},
				{"토끼","구토끼","오바트끼","때기"}};
		return res[kind];
	}
	@ModelAttribute("main")
	public Object game(@PathVariable int kind,@PathVariable int main,@PathVariable String service)
	{
		
		String res = kind+"/"+main+"/"+service;
		
	
		return res;
	}
	
	@RequestMapping
	public String path(@PathVariable String kind)
	{
		//String res="lol";
		//return "path/"+kind;
		return "path/model"; 
	}
}
