package com.websol.notice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Bean;
import com.websol.service.BoardRepository;



@Controller
@RequestMapping("/board/{kind}")
public class BoardController {

	@RequestMapping
	public ModelAndView list(@PathVariable("kind") String kind)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:contextConfig.xml");
		
		BoardRepository rep = (BoardRepository)appContext.getBean("boardRepository");
		Object res = null;
		switch(kind)
		{
		case "list":
			res = rep.selectList();
			break;
		case "detail":
			res = rep.selectDetail(4);
			break;
		case "insert":
			Bean bean = new Bean(50,2,"밍또","반장");
			res = rep.insertOne(bean);
			break;
		case "insertList":
			ArrayList<Bean> list = new ArrayList<>();
			list.add(new Bean(91,2,"밍또99","반장99"));
			list.add(new Bean(92,2,"의준99","반의반장99"));
			list.add(new Bean(93,2,"대철99","빤장99"));
			res = rep.insertList(list);
			kind = "insert";
			break;
		case "update":
			res = rep.update();
			kind = "insert";
			break;
		case "delete":
			res = rep.delete();
			kind = "insert";
			break;
		}
		
		
		ModelAndView mav = new ModelAndView("board/"+kind);
		mav.addObject("data", res);
		return mav;
	}
	
	
  
}