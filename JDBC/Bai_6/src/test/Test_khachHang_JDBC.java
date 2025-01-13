package test;

import java.sql.Date;

import dao.khachHang_DAO;
import model.KhachHang;

public class Test_khachHang_JDBC {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Date date = new Date((2003 - 1900), (11 - 1), 23);
            KhachHang kh1 = new KhachHang("KH"+i, "Nguyễn Thành Long", date, "Yên Bái");
            khachHang_DAO.getInstance().insert(kh1);
        }

        // KhachHang kh2 = new KhachHang("KH");
        // khachHang_DAO.getInstance().delete(kh2);

    }
}
