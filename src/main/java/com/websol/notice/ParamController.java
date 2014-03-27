package com.websol.notice;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;
import com.websol.service.Log;



@Controller
public class ParamController {

	@RequestMapping("param")
	public String param(@RequestParam("id") String id)
	{//인수가 없으면 id값을 받을수 없어 에러 발생
		return "param/param";
	}
	
	@RequestMapping("param2")
	public ModelAndView param2(@RequestParam(value="id",required=false,defaultValue="밍또") String id)
	{			//인수가 없어도 에러발생 되지 않도록 함required=false
				//값이 없을경우 초기값 지정가능 (뷰페이지로 포워딩 되지 않는게 함정)
		
		ModelAndView mav = new ModelAndView("param/param");
		mav.addObject("id", id);
		
		
		return mav;
	}
   
	@RequestMapping("send")
	public ModelAndView send()
	{
		//뷰페이지 진입이아닌 리다이렉트
		//request.attribute객체가 넘어가지 않는다. forward가 아니기 때문에 데이터 상실
		//return "redirect:direct";
		
		ModelAndView mav = new ModelAndView("redirect:direct");
		
		mav.addObject("id", "밍밍");
		mav.addObject("pw", "1234");
		//일반적 자료형형태는 넘길수 있으나 구조형태를 지닌 Object는 넘길 수 없다.
		//반드시 보내야 한다면 , 넘기고자 하는 멤버변수를 각각 별도로 처리하여 받는다.
		//mav.addObject("stud", new Stud("전지현", 100, 100, 100, 100, 0, 0));
		
		return mav;
	}
	
	@RequestMapping("direct")
	public String direct(Stud st)
	{//인수가 없으면 id값을 받을수 없어 에러 발생
		System.out.println(st.getId());
		return "direct/direct";
	}
}