<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href = "hello">hello</a><br>
<a href = "nowStud">nowStud</a><br>

<a href = "inputStu">inputStu</a><br>
<a href = "inputList">inputList</a><br>

<a href = "upload1">upload</a><br>
<a href = "homework?bancount=2&stcount=2">homework</a><br>


<a href = "totStud">totStud</a><br>

<a href = "cookie/make">cookie/make</a>
<a href = "cookie/view">cookie/view</a>
<a href = "cookie/delete">cookie/delete</a> 
<br>
<a href = "login/form">login/form</a>
<br>
<a href = "session/make">session/make</a>
<a href = "session/view">session/view</a>
<a href = "session/delete">session/delete</a> 
<a href = "session/log?id=aaa&pw=1234">session/log</a>
<br>
<a href = "param">param</a> 
<br>
<a href = "param?id=aaa&page=1">param</a> 
<br>
<a href = "param2">param2</a>
<br>
<a href = "param2?id=bbb&page=2">param2</a> 
<br> 

<a href = "send">send</a> <br>
<a href = "direct">direct</a> <br>

<a href = "model">model</a> <br>
<a href = "model">model2</a> <br>

<a href = "hwstud">hwstud</a> <br>

<a href = "path/lol">path/lol</a> <br>
<a href = "path/diablo">path/diablo</a> <br>

<a href = "path/1/0">path/1/0</a> <br>
<a href = "path/0/0/list">path/0/0/list</a> <br>

<br>
<br>
<br>

<a href = "validate/login">validate/login</a> <br>

<a href = "init/form?from=2014-03-27">initbinder</a> <br>

<a href = "pathstud/loginform">pathstud/loginform</a> <br>

<a href = "interceptor/login">interceptor/login</a> <br>

<a href = "excep/container">excep/container</a> <br>
<a href = "excep/container?id=AAA">excep/container?id=AAA</a> <br>

<a href = "excep/allcontainer">excep/allcontainer</a> <br>
<a href = "excep/allcontainer?id=Aaa&jum=5">excep/allcontainer?id=Aaa&jum=5</a> <br>
<a href = "excep/allcontainer?id=1234&jum=0">excep/allcontainer?id=1234&jum=0</a> <br>
<a href = "excep/allcontainer?id=1234&jum=2">excep/allcontainer?id=1234&jum=2</a> <br>

</body>
</html>
