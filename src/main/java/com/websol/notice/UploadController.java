package com.websol.notice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.FileData;
import com.websol.service.FileUp;


@Controller
public class UploadController {

	@Autowired
	FileUp fileup;
   @RequestMapping(value="/upload1",method = RequestMethod.GET)
   public String get(){
      return "upload/form";
   }
   
   //넘겨 받는 방법 첫번째 리퀘스트 파라메타
   @RequestMapping(value="/upload1",method = RequestMethod.POST)
   public ModelAndView submit(@RequestParam("num") Integer num, @RequestParam("upfile") MultipartFile upfile, HttpServletRequest request){
                                    //parameter를 속성별로 받아옴, 받아 오면서 인수형태로 형 변환
                                    //MultipartFile 파일 형태를 받는 인터페이스
                                    //request는 기본으로 가지고 있다.
	   fileup.print(num, upfile);
      String sysfilename = null;
      if(fileup.extChk(upfile.getOriginalFilename()))
      {
    	  sysfilename = fileup.fileUpload(upfile, request);
      }
      
      ModelAndView mav = new ModelAndView("upload/submit");
      mav.addObject("num", num);
      mav.addObject("oriFile", upfile.getOriginalFilename());
      mav.addObject("sysFile", sysfilename);
      return mav;
   }
   
   @RequestMapping(value="/upload2",method = RequestMethod.POST)
   public ModelAndView submit2(MultipartHttpServletRequest mm)
   {//MultipartHttpServletRequest 를 이용해서parameter를 호출
                       
	   int num =  Integer.parseInt(mm.getParameter("num"));
	   
	   MultipartFile upfile = mm.getFile("upfile");
	   fileup.print(num, upfile);
	   
	   
      String sysfilename = null;
      
      if(fileup.extChk(upfile.getOriginalFilename()))
      {
    	  sysfilename = fileup.fileUpload(upfile, mm);
      }
      
      ModelAndView mav = new ModelAndView("upload/submit");
      mav.addObject("num", num);
      mav.addObject("oriFile", upfile.getOriginalFilename());
      mav.addObject("sysFile", sysfilename);
      return mav;
   }
   //모델방식 ~~~~~핵심!!!!!
   @RequestMapping(value="/upload3",method = RequestMethod.POST)
   public String submit3(FileData fd,HttpServletRequest request)
   {
	   
	  fileup.print(fd.getNum(), fd.getUpfile());
      if(fileup.extChk(fd.getUpfile().getOriginalFilename()))
      {
    	  fd.setSysFile(fileup.fileUpload(fd.getUpfile(), request));
      }
      
      return "upload/submit2";
   }
   
   
}