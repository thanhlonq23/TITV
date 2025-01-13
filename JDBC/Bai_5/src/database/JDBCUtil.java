package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class JDBCUtil {

    // KẾT NỐI
    public static Connection getConnection() {
        Connection c = null;
        try {
            // Đăng kí MySQL với DriverManager
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver); // Đăng kí Driver
            // DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            // Các thông số
            String url = "jdbc:mySQL://localhost:3306/nhasach?";
            String username = "root";
            String password = ""; // Để rỗng bởi password trong xampp rỗng

            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    // NGẮT KẾT NỐI
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // IN THÔNG TIN
    public static void printInfo(Connection c) {
        try {
            if (c != null) {
                DatabaseMetaData mtdt = c.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
