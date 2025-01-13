<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
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



<script type="text/javascript">
	function my_submit() {
		error = "";

		maSanPham = document.getElementById("maSanPham").value;
		tenSanPham = document.getElementById("tenSanPham").value;

		if (maSanPham.length == 0) {
			error = "Bạn phải nhập mã sản phẩm";
		}
		if (tenSanPham.length == 0) {
			error += "\nBạn phải nhập tên sản phẩm";
		}

		if (error.length > 0) {
			alert(error);
			return;
		} else {
			my_form = document.getElementById("my_form");
			my_form.submit();
		}
	}
</script>
</head>


<body>
	<br>
	<br>

	<%
	String e_maSanPham = request.getAttribute("e_maSanPham") + "";
	e_maSanPham = (e_maSanPham.equals("null")) ? "" : e_maSanPham;

	String val_maSanPham = request.getAttribute("val_maSanPham") + "";
	String val_tenSanPham = request.getAttribute("val_tenSanPham") + "";
	String val_giaBan = request.getAttribute("val_giaBan") + "";
	String val_giaNhap = request.getAttribute("val_giaNhap") + "";
	String val_hanSuDung = request.getAttribute("val_hanSuDung") + "";
	String val_vat = request.getAttribute("val_vat") + "";
	String val_moTa = request.getAttribute("val_moTa") + "";

	val_maSanPham = (val_maSanPham.equals("null")) ? "" : val_maSanPham;
	val_tenSanPham = (val_tenSanPham.equals("null")) ? "" : val_tenSanPham;
	val_giaBan = (val_giaBan.equals("null")) ? "" : val_giaBan;
	val_giaNhap = (val_giaNhap.equals("null")) ? "" : val_giaNhap;
	val_hanSuDung = (val_hanSuDung.equals("null")) ? "" : val_hanSuDung;
	val_vat = (val_vat.equals("null")) ? "" : val_vat;
	val_moTa = (val_moTa.equals("null")) ? "" : val_moTa;
	%>


	<div class="container">
		<form class="row g-3 needs-validation" action="addProduct"
			id="my_form" method="post">
			<div class=" row">
				<label for="maSanPham" class="form-label">Mã sản phẩm<span
					class="rd">*
						</p>
				</span>
				</label> <input type="text" class="form-control" id="maSanPham"
					value="<%=val_maSanPham%>" name="maSanPham" required>
				<div class="rd">
					<%=e_maSanPham%>
				</div>
			</div>
			<div class=" row">
				<label for="tenSanPham" class="form-label">Tên sản phẩm <span
					class="rd">*
						</p>
				</span>
				</label> <input type="text" class="form-control" id="tenSanPham"
					value="<%=val_tenSanPham%>" name="tenSanPham" required>
			</div>
			<div class=" row">
				<label for="giaNhap" class="form-label">Giá nhập <span
					class="rd">*
						</p>
				</span></label> <input type="number" class="form-control" id="giaNhap"
					value="<%=val_giaNhap%>" name="giaNhap" required>
			</div>
			<div class=" row">
				<label for="giaBan" class="form-label">Giá bán <span
					class="rd">*
						</p>
				</span></label> <input type="number" class="form-control" id="giaBan"
					value="<%=val_giaBan%>" name="giaBan" required>
			</div>
			<div class=" row">
				<label for="hanSuDung" class="form-label">Hạn sử dụng</label> <input
					type="datetime-local" class="form-control" id="hanSuDung"
					value="<%=val_hanSuDung%>" name="hanSuDung" required>
			</div>
			<div class=" row">
				<label for="vat" class="form-label">VAT</label> <input type="number"
					class="form-control" id="vat" value="<%=val_vat%>" name="vat"
					required>
			</div>
			<div class=" row">
				<label for="mota" class="form-label">Mô tả</label>
				<textarea rows="3" cols="1" id="mota" value="" name="moTa"><%=val_moTa%></textarea>
			</div>

			<div class="col-12">
				<button class="btn btn-primary" type="button" onclick="my_submit()">Submit
				</button>
			</div>
		</form>
	</div>
</body>
</html>