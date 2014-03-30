package com.websol.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;

@Controller
public class ExcepController {

	@RequestMapping("excep/container")
	public ModelAndView make(Stud st)
	{
		//에러발생을 위한 처리
		st.setId(st.getId().toLowerCase());
		System.out.println("id:"+st.getId());
		ModelAndView mav = new ModelAndView("excep/container");
		return mav;
	}
	//예외를 컨트롤러에서 직접 처리하는 방식-->예외 처리용 메소드 정의
	//인수로 예외처리 종류 입력
	@ExceptionHandler(Exception.class)
	public String controllerExcep(Exception e)
	{							//메소드의 인수로 예외를 받아올 수 있다.
		System.out.println(e.getMessage());
		return "excep/excep";
	}
	
}
