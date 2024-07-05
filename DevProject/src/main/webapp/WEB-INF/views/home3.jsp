<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Locale"%>
<%
Date date = new Date();
DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
String formattedDate = dateFormat.format(date);
String serverTime = formattedDate;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home3</title>
</head>
<body>
	<h1>home3</h1>
	<p>
		server :
		<%=serverTime%></p>
</body>
</html>