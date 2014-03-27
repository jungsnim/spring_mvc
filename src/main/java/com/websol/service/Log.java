package com.websol.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.websol.notice.model.Stud;

@Component
public class Log {
	Map<String,String> idPwList= new LinkedHashMap<String,String>();
	
	public Log() {
		idPwList.put("aaa", "aaa");
		idPwList.put("bbb", "bbb");
		idPwList.put("ccc", "ccc");
		idPwList.put("ddd", "ddd");
		
	}
	public boolean logChk(Stud stud)
	{
		String key = stud.getId();
		if(idPwList.containsKey(key))
		{
			String pw = idPwList.get(key);
			return pw.equals(stud.getPw());
		}
		return false;
	}
   
}
