<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int[] arr ={5,85,45,47,12,11,1,7,6};
	for(int i =0; i < arr.length; i ++)
	{
		out.print(arr[i]);
		if(i < arr.length - 1)
			out.print(",");
	}

%>
