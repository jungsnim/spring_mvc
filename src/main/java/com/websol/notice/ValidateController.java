package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websol.notice.model.Stud;
import com.websol.service.LoginValidator;



@Controller
@RequestMapping("validate/login")
public class ValidateController {

	String view = "validate/form";
	@RequestMapping(method=RequestMethod.GET)
	public String form()
	{
	   
		return view;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Stud st,BindingResult res)
	{
							
	    new LoginValidator().validate(st, res);
	    //에러 발생시 검사 결과...
	    if(res.hasErrors())
	    	return view;
	    
		return "validate/submit";//성공
	}
	
}