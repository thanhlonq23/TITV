<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hóa đơn</title>
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
	<div class="container mt-4">
		<h1 style="text-align: center;">Hóa đơn bán hàng</h1>
		<br>
		<%
		String processor = request.getParameter("processor");
		String ram = request.getParameter("ram");
		String monitor = request.getParameter("monitor");
		String[] accessories = request.getParameterValues("accessories");
		%>

		<%
		double price = 0;
		double processorPrice = 0;
		double ramPrice = 0;
		double monitorPrice = 0;
		double accessoriesPrice = 0;

		if (processor != null) {
			if (processor.equalsIgnoreCase("Core I9")) {
				processorPrice = 10000000;
			} else if (processor.equalsIgnoreCase("Core I7")) {
				processorPrice = 7000000;
			} else if (processor.equalsIgnoreCase("Core I5")) {
				processorPrice = 5000000;
			}
			price += processorPrice;
		}

		if (ram != null) {
			if (ram.equalsIgnoreCase("16 GB")) {
				ramPrice = 2000000;
			} else if (ram.equalsIgnoreCase("8 GB")) {
				ramPrice = 1000000;
			}
			price += ramPrice;
		}

		if (monitor != null) {
			if (monitor.equalsIgnoreCase("monitor")) {
				monitorPrice = 6000000;
			}
			price += monitorPrice;
		}

		if (accessories != null) {
			for (String choice : accessories) {
				if (choice.equalsIgnoreCase("camera")) {
			accessoriesPrice = 500000;
				}
				if (choice.equalsIgnoreCase("printer")) {
			accessoriesPrice = 900000;
				}
				if (choice.equalsIgnoreCase("scanner")) {
			accessoriesPrice = 700000;
				}
				price += accessoriesPrice;
			}
		}

		NumberFormat vndFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		String priceVND = vndFormat.format(price);
		%>



		<table class="table table-striped" border="1px">
			<thead>
				<tr>
					<th scope="col">Tên sản phẩm</th>
					<th scope="col">Giá tiền</th>
				</tr>
			</thead>
			<tbody>
				<%
				if (processor != null) {
				%>
				<tr>
					<td><%=processor%></td>
					<td><%=vndFormat.format(processorPrice)%></td>
				</tr>
				<%
				}
				%>

				<%
				if (ram != null) {
				%>
				<tr>
					<td>RAM <%=ram%></td>
					<td><%=vndFormat.format(ramPrice)%></td>
				</tr>
				<%
				}
				%>

				<%
				if (monitor != null) {
				%>
				<tr>
					<td><%=monitor%></td>
					<td><%=vndFormat.format(monitorPrice)%></td>
				</tr>
				<%
				}
				%>


				<%
				if (accessories != null) {
					for (String choice : accessories) {
						if (choice.equalsIgnoreCase("camera")) {
							accessoriesPrice = 500000;
						}
						if (choice.equalsIgnoreCase("printer")) {
							accessoriesPrice = 900000;
						}
						if (choice.equalsIgnoreCase("scanner")) {
							accessoriesPrice = 700000;
						}
				%>
				<tr>
					<td><%=choice%></td>
					<td><%=vndFormat.format(accessoriesPrice)%></td>
				</tr>
				<%
					}
				}
				%>



			</tbody>
			<tfoot>
				<tr>
					<th scope="row">Tổng tiền</th>
					<th><%=priceVND%></th>
				</tr>
			</tfoot>
		</table>
	</div>

</body>
</html>