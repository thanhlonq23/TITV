
package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import dao.kh_DAO;
import database.JDBCUtil;
import model.KhachHang;

public class Test_khachHang_JDBC {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<KhachHang> selectByCondition(String condition) {
        ArrayList<KhachHang> ketQua = new ArrayList<KhachHang>();

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "SELECT * FROM khachhang WHERE " + condition + " AND DiaChi = 'Ha Noi';";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("ID");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                KhachHang k = new KhachHang(id, hoTen, ngaySinh, diaChi);
                ketQua.add(k);
            }

            // Bước 4:
            System.out.println("  - Bạn đã thực thi: " + sql);

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 100; i++) {
        // Date date = new Date((2003 - 1900), (11 - 1), 23);
        // KhachHang kh1 = new KhachHang("KH"+i, "Nguyễn Thành Long", date, "Yên Bái");
        // khachHang_DAO.getInstance().insert(kh1);
        // }

        // KhachHang kh2 = new KhachHang("KH");
        // khachHang_DAO.getInstance().delete(kh2);

        ArrayList<KhachHang> kh3 = kh_DAO.getInstance().selectALL();
        for (KhachHang khachHang : kh3) {
            System.out.println(khachHang.toString());
        }

        // KhachHang kh4 = new KhachHang("KH10");
        // System.out.println(khachHang_DAO.getInstance().selectById(kh4));

        // String condition = "NgaySinh <= '2002-01-01'";
        // ArrayList<KhachHang> kh4 =
        // khachHang_DAO.getInstance().selectByCondition(condition);
        // for (KhachHang khachHang : kh4) {
        // System.out.println(khachHang.toString());
        // }
        // System.out.print(" - Nhap: ");
        // String n = sc.nextLine();
        // String condition = "ID = 'KH" + n + "'";
        // ArrayList<KhachHang> kh4 = selectByCondition(condition);
        // for (KhachHang khachHang : kh4) {
        // System.out.println(khachHang.toString());
        // }
    }

}
