package test;

import java.sql.Connection;

import database.JDBCUtil;

public class testJDBC_Util {
    public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();
        // System.out.println("\nConnection: " + connection);

        JDBCUtil.printInfo(connection);

        JDBCUtil.closeConnection(connection);
        System.out.println("\nConnection: " + connection);

    }
}
