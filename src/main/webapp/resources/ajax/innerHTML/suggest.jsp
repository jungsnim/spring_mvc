<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String[] keyword = {
		"AAAA","abcd",
		"ABcd","bcdAA","bcAAccc","fewetewg","pioiop","밍밍밍","망망망"
	};
	public String sch(String key)
	{
		if(key == null || key.equals(""))
			return "";
		
		List<String> list = new ArrayList();
		Pattern pp = Pattern.compile(".*"+key+".*");
		
		for(String str: keyword)
		{
			Matcher mm = pp.matcher(str);
			if(mm.matches())
			{
				list.add(str);
			}
		}
		String res="";
		int cnt = 0;
		for(String str : list)
		{ 
			res+=str;
			cnt++;
			if(cnt< list.size())
				res+=",";
			
		}
		return res;
	}
%>
<%
	request.setCharacterEncoding("UTF-8");
	String key=request.getParameter("key");
	out.print(sch(key));
%>
