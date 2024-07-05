<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home4</title>
</head>
<body>
	<h3>Result</h3>
	<h4>hobbyArray :</h4>
	<c:forEach var="hobby" items="${hobbyArray}">
		<c:out value="${hobby}" />
		<br>
	</c:forEach>

	<h4>hobbyList :</h4>
	<c:forEach var="hobby" items="${hobbyList}">
		<c:out value="${hobby}" />
		<br>
	</c:forEach>

	<h4>carArray :</h4>
	<c:forEach var="car" items="${carArray}">
		<c:out value="${car}" />
		<br>
	</c:forEach>

	<h4>carList :</h4>
	<c:forEach var="car" items="${carList}">
		<c:out value="${car}" />
		<br>
	</c:forEach>
</body>
</html>