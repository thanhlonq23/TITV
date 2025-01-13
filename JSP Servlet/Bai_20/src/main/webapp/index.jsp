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
		<h1>Chọn cấu hình máy tính bạn cần mua:</h1>
		<hr>
		<form action="HoaDon.jsp" method="get">
			<div class="Processor">
				<h3>Processor</h3>
				<div class="form-check">
				  	<input class="form-check-input mt-0" type="radio" value="Core I9" name="processor" id="i9">
					<label for="i9" name="processor">Core I9</label>
				</div>
				<div class="form-check">
				  	<input class="form-check-input mt-0" type="radio" value="Core I7" name="processor" id="i7">
					<label for="i7" name="processor">Core I7</label>
				</div>
				<div class="form-check">
				  	<input class="form-check-input mt-0" type="radio" value="Core I5" name="processor" id="i5">
					<label for="i5" name="processor">Core I5</label>
				</div>
			</div>
		
			<div class="RAM">
				<h3>RAM</h3>
				<div class="form-check">
				  	<input class="form-check-input mt-0" type="radio" value="8 GB" name="ram" id="8GB">
					<label for="8GB" name="ram">8 GB</label>
				</div>
				<div class="form-check">
				  	<input class="form-check-input mt-0" type="radio" value="16 GB" name="ram" id="16GB">
					<label for="16GB" name="ram">16 GB</label>
				</div>
			</div>
				
			<div class="Monitor">
				<h3>Monitor</h3>
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" value="Monitor" id="flexCheckDefault" name="monitor">
				  <label class="form-check-label" for="flexCheckDefault" name="Monitor">monitor</label>
				</div>
			</div>
			
			<div class="Accessories">
				<h3>Accessories</h3>
				<select class="form-select" multiple aria-label="Multiple select example" name="accessories">
				  <option value="Camera">Camera</option>
				  <option value="Printer">Printer</option>
				  <option value="Scanner">Scanner</option>
				</select>
			</div>
			
			<button type="submit" class="btn btn-primary">Đặt hàng</button>
		</form>
	</div>
</body>
</html>