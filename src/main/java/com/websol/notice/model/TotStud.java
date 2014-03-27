package com.websol.notice.model;

public class TotStud {
	String name;
	int age;
	String tel;
	FileData fileData;
	
	String localFile;
	
	
	public String getLocalFile() {
		return localFile;
	}
	public void setLocalFile(String localFile) {
		this.localFile = localFile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public FileData getFileData() {
		return fileData;
	}
	public void setFileData(FileData fileData) {
		this.fileData = fileData;
	}
	
}
