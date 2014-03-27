package com.websol.notice.model;

public class PageProc {
	String top = "top.jsp";
	String midLeft = "midleft.jsp";
	String midRight = "midright.jsp";
	String bottom = "bottom.jsp";
	
	Integer banIdx=0;
	Integer studIdx=0;
	
	
	public Integer getBanIdx() {
		return banIdx;
	}
	public void setBanIdx(Integer banIdx) {
		this.banIdx = banIdx;
	}
	public Integer getStudIdx() {
		return studIdx;
	}
	public void setStudIdx(Integer studIdx) {
		this.studIdx = studIdx;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getMidLeft() {
		return midLeft;
	}
	public void setMidLeft(String midLeft) {
		this.midLeft = midLeft;
	}
	public String getMidRight() {
		return midRight;
	}
	public void setMidRight(String midRight) {
		this.midRight = midRight;
	}
	public String getBottom() {
		return bottom;
	}
	public void setBottom(String bottom) {
		this.bottom = bottom;
	}
	
	
}
