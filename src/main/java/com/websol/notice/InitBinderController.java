package com.websol.notice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websol.notice.model.InitDate;



@Controller
@RequestMapping("init/form")
public class InitBinderController {

	@RequestMapping(method=RequestMethod.GET)
	public String form(InitDate date)
	{
	   
		return "init/form";
	}
	
	@InitBinder //query 인수들을 bean형태로 받기전에 초기 값을 처리하여 넘겨줌.
	public void initBinder(WebDataBinder binder)
	{
		//초기값을 처리할 바인더
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
		//인수로 들어오는 값을 형변환 처리한다.
	}
	
}