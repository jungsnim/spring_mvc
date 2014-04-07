<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String [][] arr={{"손연재1 트리플 악셀 3회전 성공해",
		"추신수1 32 세이브 성공",
		"류현진1 글랜드 슬램 달성",
		"기성용1 3점 버저비터 성공"},
		{"손연재2 트리플 악셀 3회전 성공해",
		"추신수2 32 세이브 성공",
		"류현진2 글랜드 슬램 달성",
		"기성용2 3점 버저비터 성공"},
		{"손연재3 트리플 악셀 3회전 성공해",
			"추신수3 32 세이브 성공",
			"류현진3 글랜드 슬램 달성",
			"기성용3 3점 버저비터 성공"}
	};
	int nIdx = 0;
	if(request.getParameter("no") != null)
		nIdx = Integer.parseInt(request.getParameter("no"));
	for(int i =0; i < arr[nIdx].length; i ++)
	{
		out.print(arr[nIdx][i]+"<br>");
	}

%>
