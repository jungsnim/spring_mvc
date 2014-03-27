package com.websol.notice.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompBan implements Comparator<StudList>
{

	@Override
	public int compare(StudList o1, StudList o2) {
		
		if(o1.getAvg() > o2.getAvg())
			return 1;
		else if(o1.getAvg() == o2.getAvg())
			return 0;
		else
			return -1;
	}
	
}
public class School {
	
	List<StudList> banList = new ArrayList<StudList>();

	public School() {
	}

	public StudList getBan(Integer ban)
	{
		return banList.get(ban);
	}
	public List<StudList> getBanList() {
		return banList;
	}

	public void setBanList(List<StudList> banList) {
		this.banList = banList;
	}
	
	public void sort()
	{
		Collections.sort(banList,new CompBan());
	}
	 
}
