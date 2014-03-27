package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websol.notice.model.BuyOrder;

@Controller
public class ListController {


	@RequestMapping(value="/inputList", method = RequestMethod.GET)
	public String get( )
	{
	
		return "list/form";
	}
	@RequestMapping(value="/inputList", method = RequestMethod.POST)
	public String submit(@ModelAttribute("pr") BuyOrder order)
	{//뷰페이지의 어트리뷰트로 자동등록
		//클래스의 빈 형태 이름 BuyOrder: buyOrder(0)
		//변수명으로 넘어가는 것이 아님에 유의 하자
		//변수명(order)은 현재 메소드에서 인수로 사용되는 접근 이름
		return "list/submit";
	}
}
