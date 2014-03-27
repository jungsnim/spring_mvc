package com.websol.notice.model;

import java.util.ArrayList;
import java.util.List;

public class StudList {
	List<Stud> stdList = new ArrayList<Stud>();
	Integer ban;
	Integer avg;
	public StudList() {
	}
	public StudList(Integer ban,List<Stud> stdList) {
		this.ban = ban;
		this.stdList = stdList;
	}
	public Stud getStudInfo(Integer idx)
	{
		return stdList.get(idx);
	}
	public Integer getAvg() {
		int tot = 0;
		
		for (Stud st : stdList) {
			tot+=st.getAvg();
		}
		avg = tot/stdList.size();
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}

	public Integer getBan() {
		return ban;
	}
	public void setBan(Integer ban) {
		this.ban = ban;
	}


	public List<Stud> getStdList() {
		return stdList;
	}
	public void setStdList(List<Stud> stdList) {
		this.stdList = stdList;
	}
	
	
}
