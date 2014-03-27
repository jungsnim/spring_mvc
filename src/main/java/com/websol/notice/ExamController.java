package com.websol.notice;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;

@Controller
public class ExamController {

	@Resource(name="stud")
	Stud st;
	
	@RequestMapping("/nowStud")
	public ModelAndView nowStud()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("nowStud");
		mav.addObject("st", st);
		
		return mav;
	}
}
