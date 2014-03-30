package com.websol.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.PageProc;
import com.websol.notice.model.Stud;
import com.websol.notice.model.UserInfo;
import com.websol.service.HWLoginValidator;
import com.websol.service.LoginValidator;
import com.websol.service.VirtualDB;

@Controller
public class HWValidateLoginController {

	@Autowired
	VirtualDB vdb;
	@RequestMapping(value="/pathstud/loginform")
	public String loginForm()
	{
		return "pathstud/login";
	}
			
	@RequestMapping(value="/pathstud/login",method=RequestMethod.POST)
	public String submit(@ModelAttribute("page")PageProc page ,
			@ModelAttribute("user") UserInfo userInfo,HttpSession session,BindingResult res)
	{
		HWLoginValidator vd = new HWLoginValidator();
		vd.setVdb(vdb);
		vd.validate(userInfo, res);
	    if(res.hasErrors())
	    {
	    	return "pathstud/login";
	    }
	    else //로그인 성공
	    {
	    	session.setAttribute("loginedID", userInfo.getId());
	    	return "redirect:/pathstud/0/0";
	    }
	    
	    
		
	}
	
	
}
