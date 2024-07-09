<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>
			<spring:message code="welcome.message" />
			<br>
			<spring:message code="welcome.message" arguments="홍길동" />
			<br>
			<span>Hello World ${serverTime}</span>
		</h1>
	</div>
</body>
</html>