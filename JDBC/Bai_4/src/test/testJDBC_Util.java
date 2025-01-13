package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class testJDBC_Util {
    public static void main(String[] args) {
        try {
            // Bước 1: Kết nối
            Connection connection = JDBCUtil.getConnection();

            // Bước 2: Tạo ra đối tượng statement
            Statement st = connection.createStatement();

            // Bước 3: Thực thi một câu lệnh SQL
            String sql = "INSERT INTO persons(last_name,first_name,gender,dob,income)"
                    + "VALUES (\"Tran\",\"Binh\",\"M\",\"2001-08-23\",900)";

            int check = st.executeUpdate(sql);

            // Bước 4: Xử lý kết quả 
            System.out.println("Số dòng thay đổi: "+check);
            if (check>0) {
                System.out.println("Thêm dữ liệu thành công !!!");
            }else{
                System.out.println("Thêm dữ liệu thất bại !!!");
            }

            // Bước 5: Ngắt kết nối
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
