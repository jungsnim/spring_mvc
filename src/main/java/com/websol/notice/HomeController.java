package com.websol.notice;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("/hello") //주소에 따른 메소드 지정
	public ModelAndView hello(){
		//빈의 형태로 data와 주소를 넘길때 사용하는 클래스
		//스프링에서 제공
		ModelAndView mav = new ModelAndView();
		//뷰페이지 지정 servlet-context.xml ViewResolver과 결합되어 사용
		mav.setViewName("hello");
		mav.addObject("foot",getFoot());
		return mav;
	}
	String getFoot()
	{
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String res = "";
		
		if(hour >= 6 && hour <= 16 )
			res = "아침반은 두발";
		else if(hour >= 16 && hour <= 22 )
			res = "오후반은 세발";
		else
		{
			res = "밤에는 개발";
		}
		return res;
	}
	
}
