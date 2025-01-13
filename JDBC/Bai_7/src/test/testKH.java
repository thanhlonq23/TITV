package test;
// import java.sql.Date;
import java.util.ArrayList;

import dao.khachHang_DAO;
import model.KhachHang;
public class testKH {
    public static void main(String[] args) {
        // for (int i = 1; i <= 100; i++) {
        // Date date = new Date((2003 - 1900), (11 - 1), 23);
        // KhachHang kh1 = new KhachHang("KH"+i, "Nguyễn Thành Long", date, "Yên Bái");
        // khachHang_DAO.getInstance().insert(kh1);
        // }

        // KhachHang kh2 = new KhachHang("KH");
        // khachHang_DAO.getInstance().delete(kh2);

        // ArrayList<KhachHang> kh3 = khachHang_DAO.getInstance().selectALL();
        // for (KhachHang khachHang : kh3) {
        // System.out.println(khachHang.toString());
        // }

        // KhachHang kh4 = new KhachHang("KH10");
        // System.out.println(khachHang_DAO.getInstance().selectById(kh4));

        String condition = "NgaySinh <= '2002-01-01'";
        ArrayList<KhachHang> kh4 = khachHang_DAO.getInstance().selectByCondition(condition);
        for (KhachHang khachHang : kh4) {
            System.out.println(khachHang.toString());
        }

    }
}
