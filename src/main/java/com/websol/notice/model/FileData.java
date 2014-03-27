package com.websol.notice.model;

import org.springframework.web.multipart.MultipartFile;

public class FileData {

	
	Integer num;
	MultipartFile upfile;
	
	String sysFile = null;//입력폼의 인수가 아니라 처리된 결과값 출력용으로 사용된다.
	
	
	public String getSysFile() {
		return sysFile;
	}
	public void setSysFile(String sysFile) {
		this.sysFile = sysFile;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public MultipartFile getUpfile() {
		return upfile;
	}
	public void setUpfile(MultipartFile upfile) {
		this.upfile = upfile;
	}
	
	
}
