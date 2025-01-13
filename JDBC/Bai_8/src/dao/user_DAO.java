package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class user_DAO implements DAO_Interface<User> {

    public static user_DAO getInstance() {
        return new user_DAO();
    }

    @Override
    public int insert(User t) {
        int ketQua = 0;
        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: Tạo ra đối tượng PrepareStatement
            String sql = "INSERT INTO user (username,password,hovaten)"
                    + " VALUES (?, ?, ?);";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUsername());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getHovaten());
            
            // Bước 3: Thực thi câu lệnh SQL

            ketQua = pst.executeUpdate();
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
    public int update(User t) {
        int ketQua = 0;
        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: Tạo ra đối tượng PrepareStatement
            String sql = "UPDATE user"
                    + " SET hovaten = '?'"
                    + ",password = '?'"
                    + " WHERE username = '?';";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUsername());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getHovaten());

            // Bước 3: Thực thi câu lệnh
            ketQua = pst.executeUpdate();
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
    public int delete(User t) {
        int ketQua = 0;
        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            String sql = "DELETE FROM user"
                    + " WHERE username = '?';";
            PreparedStatement pst = con.prepareStatement(sql);

            // Bước 3:
            pst.setString(1, t.getUsername());
            ketQua = pst.executeUpdate();

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
    public ArrayList<User> selectALL() {
        ArrayList<User> ketQua = new ArrayList<User>();
        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            String sql = "SELECT * FROM user;";
            PreparedStatement pst = con.prepareStatement(sql);
            System.out.println(sql);

            // Bước 3:
            ResultSet rs = pst.executeQuery();

            // Bước 4:
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hovaten = rs.getString("hovaten");

                User s = new User(username, password, hovaten);
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
    public User selectById(User t) {
        User ketQua = null;

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            String sql = "SELECT * FROM user WHERE username = ? ;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUsername());
            
            // Bước 3:
            System.out.println(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hovaten = rs.getString("hovaten");
                ketQua = new User(username, password, hovaten);
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
    public ArrayList<User> selectByCondition(String condition) {
        ArrayList<User> ketQua = new ArrayList<>();

        try {
            // Bước 1:
            Connection con = JDBCUtil.getConnection();

            // Bước 2:
            String sql = "SELECT * FROM user WHERE ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            System.out.println(sql);

            // Bước 3:
            pst.setString(1, condition);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hovaten = rs.getString("hovaten");

                User s = new User(username, password, hovaten);
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
