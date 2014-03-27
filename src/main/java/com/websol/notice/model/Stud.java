package com.websol.notice.model;

import org.springframework.stereotype.Component;

@Component
public class Stud {
	String name="밍또",id,pw;
	int kor=10,eng=80,mat=50,num=0;
	int sum,avg;
	public Stud() {
		// TODO Auto-generated constructor stub
	}
	public Stud(String name) {
		this.name = name;
	}
	public Stud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSum() {
		return kor + eng + mat;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return (int)(kor + eng + mat)/3;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Stud [name=" + name + ", kor=" + kor + ", eng=" + eng
				+ ", mat=" + mat + ", num=" + num + ", sum=" + getSum() + ", avg="
				+ getAvg() + "]";
	}

	
	
	
}
