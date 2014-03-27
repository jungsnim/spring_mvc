package com.websol.notice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;


@Controller
public class ModelController {

	@ModelAttribute("mainMenu")
	public List main()
	{
		List res = new ArrayList();
		res.add("1학년");
		res.add("2학년");
		res.add("3학년");
		return res;
	}
	@ModelAttribute("subMenu")
	public Object sub(Stud st)
	{
		String[][] res={{"소나리반","닭나리반"},
						{"송아지반","망하지반","안망하지반"},
						{"토끼","구토끼","오바트끼","때기"}};
		return res[st.getNum()];
	}
	
	@RequestMapping("model")
	public String param()
	{//인수가 없으면 id값을 받을수 없어 에러 발생
		return "model/model";
	}
	@RequestMapping("model2")
	public String param2()
	{//인수가 없으면 id값을 받을수 없어 에러 발생
		return "model/model2";
	}
	
	
	
	public ModelAndView test(){
		List res = new ArrayList();
		res.add("1학년");
		res.add("2학년");
		res.add("3학년");
		ModelAndView mav = new ModelAndView("model/model");
		mav.addObject("res", res);
		return mav;
	}
	
}