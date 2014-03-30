package com.websol.notice;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

	@RequestMapping("interceptor/login")
	public String event()
	{
		return "interceptor/login";
	}
	@RequestMapping("interceptor/loginreq")
	public String expire(@RequestParam("id") String id,@RequestParam("pw") String pw,HttpSession session)
	{
		if(id.equals("aaa") && pw.equals("1234"))
		{
			session.setAttribute("logined", id);
		}
		return "interceptor/login";
	}
	@RequestMapping("interceptor/logoutreq")
	public String expire(HttpSession session)
	{
		session.invalidate();
		return "interceptor/login";
	}
	
	@RequestMapping("interceptor/content/loginsuc2")
	public String contents2()
	{
		return "interceptor/content/loginsuc2";
	}
	@RequestMapping("interceptor/content/loginsuc")
	public String contents()
	{
		return "interceptor/content/loginsuc";
	}
	@RequestMapping("interceptor/loginfail")
	public String loginfail()
	{
		return "interceptor/loginfail";
	}
}
