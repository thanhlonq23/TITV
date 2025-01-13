<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	if (email.equalsIgnoreCase("lonq") && password.equals("12345")) {
	%>
	Bạn đã đăng nhập thành công
	<%
	} else {
	%>
	Bạn đã đăng nhập thất bại
	<%
	}
	%>

</body>
</html>