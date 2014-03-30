package com.websol.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.websol.notice.model.UserInfo;

public class HWLoginValidator implements Validator{
	
	
	VirtualDB vdb;
	
	public void setVdb(VirtualDB vdb)
	{
		this.vdb = vdb;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserInfo.class.isAssignableFrom(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {
		UserInfo userInfo = (UserInfo)target;
		
		if(userInfo.getId() == null || userInfo.getId().trim().isEmpty())
		{
			errors.rejectValue("id","invalid.id","ID NULL");
			return; 
		}
		if(userInfo.getPw() == null || userInfo.getPw().trim().isEmpty())
		{
			errors.rejectValue("pw","invalid.id","PW NULL");
			return; 
		}
		System.out.println("유저인포"+userInfo+"가상디비"+vdb);
		//가상 디비에서 아이디로 유저 정보를 찾아온다.
		UserInfo dbInfo = vdb.getUserInfo(userInfo.getId());
		if(dbInfo == null)
		{
			errors.rejectValue("id","invalid.id","ID가 존재하지 않습니다.");
			return ;
		}
		if(!dbInfo.getPw().equals(userInfo.getPw()))
		{
			errors.rejectValue("pw","invalid.id","PW가 일치하지 않습니다.");
			return ;
		}
	}

}
