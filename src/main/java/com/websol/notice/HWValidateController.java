package com.websol.notice;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websol.notice.model.PageProc;
import com.websol.service.VirtualDB;

@Controller
@RequestMapping("/pathstud/{main}/{sub}")
public class HWValidateController {

	@Autowired
	VirtualDB vdb;

	@RequestMapping
	public String submit(@ModelAttribute("page")PageProc page,
			@PathVariable int main,@PathVariable int sub,HttpSession session,BindingResult res)
	{
		
		page.setMidRight(main+"/"+sub+".jsp");
		 
		return "pathstud/template";
	}
	@ModelAttribute("topMenu")
	public String[] getTopMenu()
	{
		String[] top={"탑1","탑2","탑3"};
		return top;
	}
	@ModelAttribute("midMenu")
	public String[] getMidMenu()
	{
		String[] mid={"미드1","미드2","미드3"};
		return mid;
	}
	

	
	
}
