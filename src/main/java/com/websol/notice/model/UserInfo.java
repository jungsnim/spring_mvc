package com.websol.notice.model;

public class UserInfo {
	String id;
	String pw;
	String name;
	int age;
	String tel;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String id, String pw, String name, int age, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", pw=" + pw + ", name=" + name
				+ ", age=" + age + ", tel=" + tel + "]";
	}
	
	
}
