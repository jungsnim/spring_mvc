package com.websol.notice.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class LoginInfo {
	String id;
	String pass;
	Boolean succLogin =false;
	
	Map<String,String> idPass = new LinkedHashMap<String,String>();
	
	public LoginInfo() {
		
		idPass.put("밍또", "1234");
		idPass.put("빙또", "1234");
		idPass.put("핑또", "1234");
		idPass.put("삥또", "1234");
	}
	
	
	public boolean checkLogin()
	{
		succLogin = false;
		if(idPass.containsKey(id))
		{
			succLogin = idPass.get(id).equals(pass);
		}
		return succLogin;
	}
	public Boolean getSuccLogin() {
		return succLogin;
	}

	public void setSuccLogin(Boolean succLogin) {
		this.succLogin = succLogin;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
