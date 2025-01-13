<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
	
<style type="text/css">
.rd {
	color: red;
}
</style>
</head>
<body>
	<%
		String e_soLuong = request.getAttribute("e_soLuong") + "";
		String e_soDienThoai = request.getAttribute("e_soDienThoai") + "";
		String e_email = request.getAttribute("e_email") + "";
		
		e_soLuong = e_soLuong.equals("null") ? "" : e_soLuong;
		e_soDienThoai = e_soDienThoai.equals("null") ? "" : e_soDienThoai;
		e_email = e_email.equals("null") ? "" : e_email;
	%>

	<%
		String soLuong = request.getAttribute("soLuong") + "";
		String soDienThoai = request.getAttribute("soDienThoai") + "";
		String email = request.getAttribute("email") + "";
	
		soLuong = soLuong.equals("null") ? "" : soLuong;
		soDienThoai = soDienThoai.equals("null") ? "" : soDienThoai;
		email = email.equals("null") ? "" : email;
	%>


	<form id="form-1" class="row g-3 needs-validation" action="MuaHang">
		<div class="mb-3">
			<label for="input-1">Số lượng: </label> <input id="input-1"
				class="form-control" placeholder=" Nhập Số lượng" type="number"
				name="soLuong" value="<%=soLuong%>" required="required" /> <span
				class="rd"><%=e_soLuong%></span><br>
		</div>
		<div class="mb-3">
			<label for="input-2">Số điện thoại:</label> <input id="input-2"
				class="form-control" placeholder="Nhập Số điện thoại" type="number"
				name="soDienThoai" value="<%=soDienThoai%>" required="required" />
			<span class="rd"><%=e_soDienThoai%></span><br>
		</div>

		<div class="mb-3">
			<label for="input-3">Email:</label> <input id="input-3"
				class="form-control" placeholder="Nhập Email" type="text"
				name="email" value="<%=email%>" required="required" /> <span
				class="rd"><%=e_email%></span>
		</div>
		<input type="submit" class="btn btn-primary" value="Mua hàng">
	</form>
</body>
</html>