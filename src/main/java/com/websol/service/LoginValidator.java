package com.websol.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.websol.notice.model.Stud;

public class LoginValidator implements Validator{
	//유효성 검사를 위한 클래스 :Validator 를 구현해야 한다.
	
	@Override
	public boolean supports(Class<?> arg0) {
		//인수로 사용하는 클래스가 검사 하기 위한 클래스로 확인
		
		return Stud.class.isAssignableFrom(arg0);
		//isAssignableFrom
		//대상클래스가 Stud와 형변환이 되는 클래스인지 확인한다.
	}
	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		Stud stud = (Stud)arg0;
		boolean chk = true;
		if(stud.getId()==null ||stud.getId().trim().isEmpty())
		{
			//에러내용을 들어온 인수 Errors arg1로 넣어 변환한다
			//rejectValue() 에 map의 형태로 입력한다.
			//클래스를 인수로 받기 때문에 리턴하지 않아도 주소 참조로 값 전달 가능
			arg1.rejectValue("id","invalid.id", "ID 널임");
			chk=false;
		}
		
		if(stud.getPw()==null ||stud.getPw().trim().isEmpty())
		{
			arg1.rejectValue("pw","invalid.pw", "PW 널임");
			chk=false;
		}
		if(chk && !stud.getId().equals(stud.getPw()))
		{
			arg1.rejectValue("pw","invalid.pw", "ID와 PW가 일치하지 않습니다.");
		}
	}
}
