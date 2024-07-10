<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<script>
	function toMain() {
		window.location.href = "/member/main";
	}
</script>
<body>
	<h1>${check}</h1>
	<button onclick="toMain()">메인으로</button>
</body>
</html>