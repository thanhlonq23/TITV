<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Đăng nhập thất bại
	<%
	Object o = request.getAttribute("hello");
	String a = o.toString();
	%>

	<%="<br>Object: " + o%>
	<%="<br>String: " + a%>
</body>
</html>