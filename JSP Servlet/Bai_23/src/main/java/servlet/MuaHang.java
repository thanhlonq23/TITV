package servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MuaHang")
public class MuaHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MuaHang() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String soLuong = request.getParameter("soLuong");
		String soDienThoai = request.getParameter("soDienThoai");
		String email = request.getParameter("email");

		boolean checkError = false;
		double giaTri_soLuong = 0;

		// Bắt lỗi số lượng
		try {
			giaTri_soLuong = Double.parseDouble(soLuong);
		} catch (Exception e) {
			checkError = true;
			request.setAttribute("e_soLuong", "Nhập dữ liệu số lượng không đúng!");
		}

		// Bắt lỗi số lượng phải lớn hơn 0
		if (giaTri_soLuong == 0) {
			checkError = true;
			request.setAttribute("e_soLuong", "Vui lòng chọn số lượng mua lớn hơn 0!");
		}

		// Kiểm tra số diện thoại
		Pattern soDienThoaiPattern = Pattern.compile("\\d{10}");
		Matcher soDienThoaiMatcher = soDienThoaiPattern.matcher(soDienThoai);
		if (!soDienThoaiMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_soDienThoai", "Số điện thoại bao gồm 10 kí tự!");
		}

		// Kiểm tra Email
		Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
		Matcher emailMatcher = emailPattern.matcher(email);
		if (!emailMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_email", "Cấu trúc của email chưa đúng!");
		}

		String url = "/success.jsp";
		
		if (checkError) {
			url = "/index.jsp";
			request.setAttribute("soLuong", soLuong);
			request.setAttribute("soDienThoai", soDienThoai);
			request.setAttribute("email", email);
		}
		RequestDispatcher rq = getServletContext().getRequestDispatcher(url);
		rq.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
