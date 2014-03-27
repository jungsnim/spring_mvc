package com.websol.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websol.notice.model.PageProc;
import com.websol.notice.model.Stud;
import com.websol.service.VirtualDB;

@Controller
public class HWStudController {

	@Autowired
	VirtualDB vdb;
	
	
	
	@ModelAttribute("bans")
	public List<String> getBanList()
	{
		return vdb.getBanNames();
	}
	@ModelAttribute("studs")
	public List<String> getStuds(@ModelAttribute("page")PageProc page)
	{
		return vdb.getStudNames(page.getBanIdx());
	}
	
	@ModelAttribute("stinfo")
	public Stud getStInfo(@ModelAttribute("page")PageProc page)
	{
		return vdb.getStudInfo(page.getBanIdx(),page.getStudIdx());
	}
	@RequestMapping("hwstud")
	public String view(@ModelAttribute("page")PageProc page)
	{
		return "hwstud/template";
	}
}
