<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.lang.Math"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<form action="trangDatHang.jsp" method="Get">
			<div class="mb-3">
				<label for="hoten" class="form-label">Họ tên:</label> <input
					type="text" class="form-control" id="hoten" name="hoten">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email:</label> <input
					type="email" class="form-control" id="email" name="email">
			</div>
			<div class="mb-3">
				<label for="soluong" class="form-label">Số lượng</label> <input
					type="number" class="form-label" id="soluong" name="soluong">
			</div>
			<button type="submit" class="btn btn-primary">Đặt hàng</button>
		</form>
	</div>
</body>
</html>