package com.websol.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websol.notice.model.PageProc;
import com.websol.notice.model.Stud;
import com.websol.service.VirtualDB;

@Controller
@RequestMapping("pathstud/{ban}/{stud}")
public class PathStudController {

	@Autowired
	VirtualDB vdb;
	
	
	
	@ModelAttribute("bans")
	public List<String> getBanList()
	{
		return vdb.getBanNames();
	}
	@ModelAttribute("studs")
	public List<String> getStuds(@PathVariable Integer ban)
	{
		return vdb.getStudNames(ban);
	}
	
	@ModelAttribute("stinfo")
	public Stud getStInfo(@PathVariable Integer ban,@PathVariable Integer stud)
	{
		return vdb.getStudInfo(ban,stud);
	}
	
	@RequestMapping
	public String view(@ModelAttribute("page") PageProc page)
	{
		return "pathstud/template";
	}
}
