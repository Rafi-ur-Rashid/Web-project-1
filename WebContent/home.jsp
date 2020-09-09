<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<%!
		int coef=12;
	%>
	<h1>Happy JSP learning</h1>
	<%
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
	%>
	<%= "I got "+n1+" &"+n2 +"</br>"+
		"And mine is always "+coef
	%>
	<%
		int k=9/0;
	%>
	
</body>
</html>