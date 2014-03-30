package com.websol.service;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

////로그인 체크 할때 가장 많이 사용한다.
//진입전
@Component
public class EventExpireChk extends HandlerInterceptorAdapter{
//기존의 메소드가 실행시 interceptor하여 기존 메소드의 실행에 간섭
//interceptor가 진행되기 위해서는 xml에서 DefaultAnnotationHandlerMapping
//을 사용해야 하고 이에대한 처리 클래스를 property로 가지고 있어야한다.
//처리 클래스는 HandlerInterceptorAdapter를 상속받아 구현되야 하며
//처리 전,후 간섭 루틴을 작성하여야 한다.
	
	//진입전 체크
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		if(chkEvent(request) && session.getAttribute("logined")==null)
		{
			response.sendRedirect(request.getContextPath()+"/interceptor/loginfail");
			//결과는 실패로
			return false;
		}
		/*if(chkEvent(request) && chkDay())
		{
			//사전 검사가 맞다면 
			//interceptor하여 다른 페이지로 이동
			response.sendRedirect("loginfail");
			//결과는 실패로
			return false;
		}*/
		return true;
	}	
	//지정 페이지 검사
	boolean chkEvent(HttpServletRequest request)
	{
		boolean res = false;
		System.out.println(request.getContextPath());
		res = request.getRequestURI().contains(
				request.getContextPath()+"/interceptor/content/"		
				);
		return res;
	}
	
	/////날짜 검사!!
	boolean chkDay()
	{
		Calendar eventday = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		eventday.set(2014, 3, 20);
		
		//today가 eventday를 지났다면 true
		return today.after(eventday);
	}
}
