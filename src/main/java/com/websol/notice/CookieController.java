package com.websol.notice;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CookieController {


   @RequestMapping("cookie/make")
   public String make(HttpServletResponse response){
      
      //쿠키를 만들 수 있게 리스폰서를 제공한다.
      response.addCookie(new Cookie("id","aaaa"));
      
      return "cookie/make";
   }
   
   @RequestMapping("cookie/view")
                  //쿠키벨류는 = 쿠키 박스다           //디폴트 벨류는 기본 값을 줄 수 있다. 얘는 그냥 허당이다.
   public ModelAndView make(@CookieValue(value="id", defaultValue="밍") String id){
      
      System.out.println("쿠키 id:"+id);
      
      ModelAndView mav = new ModelAndView();
      
      mav.addObject("id", id);
      return mav;
   }

   //쿠키 삭제
   @RequestMapping("cookie/delete")
   public String delete(HttpServletResponse response){
      
      Cookie coo = new Cookie("id","");
   
      //쿠키 종료 시켜라 
      coo.setMaxAge(0);
      response.addCookie(coo);
             
      
      return "cookie/view";
   }
   
}