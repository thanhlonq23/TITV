package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class khachHang_DAO implements DAO_Interface<KhachHang> {

    public static khachHang_DAO getInstance() {
        return new khachHang_DAO();
    }

    @Override
    public int insert(KhachHang kh) {
        int ketQua = 0;

        try {
            // Bước 1: Tạo kết nối với CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: Tạo đối tượng Statement
            Statement st = con.createStatement();

            // Bước 3: Thực thi câu lệnh
            String sql = "INSERT INTO khachhang"
                    + " (ID,HoTen,NgaySinh,DiaChi)"
                    + " VALUES ('" + kh.getId() + "' ,'" + kh.getHoTen() + "','" + kh.getNgaySinh() + "', '"
                    + kh.getDiaChi() + "');";
            ketQua = st.executeUpdate(sql);

            // Bước 4: Xử lý câu lệnh
            System.out.println("  - Bạn đã thực thi: " + sql);
            System.out.println("  - Đã thay đổi: " + ketQua + " dòng");

            // Bước 5: Ngắt kết nối CSDL
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(KhachHang kh) {
        int ketQua = 0;

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "UPDATE khachhang"
                    + " SET Hoten = '" + kh.getHoTen()
                    + "', DiaChi = '" + kh.getDiaChi()
                    + "' WHERE ID = '" + kh.getId() + "';";

            st.executeUpdate(sql);

            // Bước 4:
            System.out.println("  - Bạn đã thực thi: " + sql);
            System.out.println("  - Đã thay đổi: " + ketQua + " dòng");

            // Bước 5:

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int delete(KhachHang kh) {
        int ketQua = 0;
        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "DELETE FROM khachhang"
                    + " WHERE ID = '" + kh.getId() + "';";
            st.executeUpdate(sql);

            // Bước 4:
            System.out.println("  - Bạn đã thực thi: " + sql);
            System.out.println("  - Đã thay đổi: " + ketQua + " dòng");

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectALL() {
        return null;
    }

    @Override
    public KhachHang selectById(KhachHang kh) {
        return null;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        return null;
    }

}
