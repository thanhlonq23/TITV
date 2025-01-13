package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class sach_DAO implements DAO_Interface<Sach> {

    public static sach_DAO getInstance() {
        return new sach_DAO();
    }

    @Override
    public int insert(Sach t) {
        int ketQua = 0;
        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: Tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: Thực thi câu lệnh SQL
            String sql = "INSERT INTO sach (ID,TenSach,GiaBan,NamXuatBan)"
                    + " VALUES ('"
                    + t.getId() + "','"
                    + t.getTenSach() + "',"
                    + t.getGiaBan() + ",'"
                    + t.getNamXuatBan() + "');";

            ketQua = st.executeUpdate(sql);
            System.out.println("  - Bạn đã thực thi: " + sql);

            // Bước 4: Xử lý kết quả
            System.out.println("  - Đã thay đổi " + ketQua + " dòng");
            // if (ketQua > 0) {
            // System.out.println(" - Thêm dữ liệu thành công !!!");
            // } else {
            // System.out.println(" - Thêm dữ liệu thất bại !!!");
            // }

            // Bước 5: Ngắt kết nối CSDL
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Sach t) {
        int ketQua = 0;
        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: Tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: Thực thi câu lệnh
            String sql = "UPDATE sach"
                    + " SET TenSach = \'" + t.getTenSach()
                    + "\',GiaBan = " + t.getGiaBan()
                    + ",NamXuatBan = " + t.getNamXuatBan()
                    + " WHERE ID = \'" + t.getId() + "\';";
            ketQua = st.executeUpdate(sql);
            System.out.println("  - Bạn đã thực thi: " + sql);

            // Bước 4:
            System.out.println("  - Đã thay đổi " + ketQua + " dòng");

            // Bước 5: Ngăt kết nối CSDL
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int delete(Sach t) {
        int ketQua = 0;
        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "DELETE FROM sach"
                    + " WHERE id = '" + t.getId() + "';";
            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("  - Bạn đã thực thi: " + sql);
            System.out.println("  - Đã thay đổi " + ketQua + " dòng");

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public ArrayList<Sach> selectALL() {
        ArrayList<Sach> ketQua = new ArrayList<Sach>();
        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "SELECT * FROM sach;";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // Bước 4:
            while (rs.next()) {
                String id = rs.getString("ID");
                String tenSach = rs.getString("TenSach");
                double giaBan = rs.getDouble("GiaBan");
                int namXuatBan = rs.getInt("NamXuatBan");

                Sach s = new Sach(id, tenSach, giaBan, namXuatBan);
                ketQua.add(s);
            }

            System.out.println("  - Bạn đã thực thi: " + sql);

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public Sach selectById(Sach t) {
        Sach ketQua = null;

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "SELECT * FROM sach WHERE ID = '" + t.getId() + "';";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("ID");
                String tenSach = rs.getString("TenSach");
                double giaBan = rs.getDouble("GiaBan");
                int namXuatBan = rs.getInt("NamXuatBan");
                ketQua = new Sach(id, tenSach, giaBan, namXuatBan);
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

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        ArrayList<Sach> ketQua = new ArrayList<>();

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            Statement st = con.createStatement();

            // Bước 3:
            String sql = "SELECT * FROM sach WHERE " + condition + ";";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("ID");
                String tenSach = rs.getString("TenSach");
                double giaBan = rs.getDouble("GiaBan");
                int namXuatBan = rs.getInt("NamXuatBan");
                Sach s = new Sach(id, tenSach, giaBan, namXuatBan);
                ketQua.add(s);
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

}
