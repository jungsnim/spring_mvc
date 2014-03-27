package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websol.notice.model.Stud;

@Controller
public class InputController {


	@RequestMapping(value="/inputStu", method = RequestMethod.GET)
	public String get( @ModelAttribute("st") Stud st)
	{//겟방식일때 빈으로 정의된 값을 오토 와이어 한다.타입으로 땡긴다.
	
		return "input/form";
	}
	@RequestMapping(value="/inputStu", method = RequestMethod.POST)
	public String submit(@ModelAttribute("st")Stud st)
	{
		System.out.println(st);
		return "input/submit";
	}
}
