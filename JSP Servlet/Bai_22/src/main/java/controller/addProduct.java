package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addProduct")
public class addProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addProduct() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String maSanPham_String = request.getParameter("maSanPham");
		String tenSanPham_String = request.getParameter("tenSanPham");
		String giaBan_String = request.getParameter("giaBan");
		String giaNhap_String = request.getParameter("giaNhap");
		String hanSuDung_String = request.getParameter("hanSuDung");
		String vat_String = request.getParameter("vat");
		String moTa_String = request.getParameter("moTa");

		// Check
		String e_maSanPham = "";
		if (maSanPham_String == null || maSanPham_String.trim().length() == 0) {
			e_maSanPham = "Vui lòng nhập mã sản phẩm";
		} else if (maSanPham_String.equals("123")) {
			e_maSanPham += "Mã sản phẩm đã tồn tại, Vui lòng nhập lại";
		}

		request.setAttribute("e_maSanPham", e_maSanPham);

		// foward
		request.setAttribute("val_maSanPham", maSanPham_String);
		request.setAttribute("val_tenSanPham", tenSanPham_String);
		request.setAttribute("val_giaBan", giaBan_String);
		request.setAttribute("val_giaNhap", giaNhap_String);
		request.setAttribute("val_hanSuDung", hanSuDung_String);
		request.setAttribute("val_vat", vat_String);
		request.setAttribute("val_moTa", moTa_String);

		String url = "/success.jsp";
		if (e_maSanPham.length() > 0) {
			url = "/product.jsp";
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
