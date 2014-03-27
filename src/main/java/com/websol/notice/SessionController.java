package com.websol.notice;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.Stud;
import com.websol.service.Log;



@Controller
public class SessionController {

	@Autowired
	Log log;
		
   @RequestMapping("session/make")
   public String make(HttpSession session){
      
	   session.setAttribute("id", "R&B");
      
      return "session/view";
   }
   
   @RequestMapping("session/view")
                  //쿠키벨류는 = 쿠키 박스다           //디폴트 벨류는 기본 값을 줄 수 있다. 얘는 그냥 허당이다.
   public String view(HttpSession session){
      
     System.out.println("Session ID"+ session.getAttribute("id"));
      return "session/view";
   }

   //쿠키 삭제
   @RequestMapping("session/delete")
   public String delete(HttpSession session){
      
	   session.invalidate();
      return "session/view";
   }
   
   @RequestMapping("session/log")
   public String log(Stud stud, HttpSession session){
      
	   String msg="로그인 실패";
	   if(log.logChk(stud))
	   {
		   session.setAttribute("id", stud.getId());
		   msg="로그인 성공";
	   }
	   System.out.println(msg);
	   return "session/view";
   }
   
}