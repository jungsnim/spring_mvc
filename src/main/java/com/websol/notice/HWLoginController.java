package com.websol.notice;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.LoginInfo;

@Controller
public class HWLoginController {

	@RequestMapping(value="/login/form")
	public String loginForm()
	{
		return "login/form";
	}
	
	@RequestMapping(value="/login/result")
	public String loginResult(@ModelAttribute("loginfo") LoginInfo loginfo ,HttpServletResponse response)
	{
		if(loginfo.checkLogin())
		{
			try {
				response.addCookie(new Cookie("id",URLEncoder.encode(loginfo.getId(),"UTF-8")));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "login/result";
	}
	@RequestMapping(value="/login/logout")
	public ModelAndView logout(@CookieValue(value="id",defaultValue="nono") String id,HttpServletResponse response)
	{
		ModelAndView mav = new ModelAndView("login/form");
		try {
			mav.addObject("id", URLDecoder.decode(id, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cookie loCook = new Cookie("id", "");
		loCook.setMaxAge(0);
		response.addCookie(loCook);
		
		return mav;
	}
}
