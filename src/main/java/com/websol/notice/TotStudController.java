package com.websol.notice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.websol.notice.model.FileData;
import com.websol.notice.model.TotStud;
import com.websol.service.FileUp;


@Controller
public class TotStudController {

	@Autowired
	FileUp fileup;
	@RequestMapping(value="/totStud")
	public String get(){
		return "totStud/form";
	}
	@RequestMapping(value="/totStudrefresh")
	public String refresh(@ModelAttribute("stud")TotStud stud, HttpServletRequest request){

		return "totStud/form";
	}
	
	
	@RequestMapping(value="/totStudRes")
	public String submit(@ModelAttribute("stud")TotStud stud, HttpServletRequest request){

		fileup.print(stud.getFileData().getNum(), stud.getFileData().getUpfile());
		if(fileup.extChk(stud.getFileData().getUpfile().getOriginalFilename()))
		{
			stud.getFileData().setSysFile(fileup.fileUpload(stud.getFileData().getUpfile(), request));
		}
		return "totStud/result";
	}
}