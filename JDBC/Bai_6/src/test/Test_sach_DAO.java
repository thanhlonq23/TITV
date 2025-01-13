package test;

import dao.sach_DAO;
import model.Sach;

public class Test_sach_DAO {
    public static void main(String[] args) {

        // Nhập
        // Sach sach1 = new Sach("LTJ", "Lập trình Java", 100000, 2020);
        // Sach sach2 = new Sach("LTC", "Lập trình C", 120000, 2015);

        // sach_DAO.getInstance().insert(sach1);
        // sach_DAO.getInstance().insert(sach2);

        // for (int i = 0; i < 1000; i++) {
        // Sach sach = new Sach("LTC" + i, "Lập trình C", 120000, 2015);
        // sach_DAO.getInstance().insert(sach);
        // }
        
        // Sửa
        // Sach sach3 = new Sach("LTC1", "Lập trình C Lậu", 50000, 2019);
        // sach_DAO.getInstance().update(sach3);
        
        // Xóa
        // Sach sach4 = new Sach("LTC1", "Lập trình C Lậu", 50000, 2019);
        // sach_DAO.getInstance().delete(sach4);

        for (int i = 0; i < 1000; i++) {
            Sach sach5 = new Sach("LTC"+i);
            sach_DAO.getInstance().delete(sach5);
        }
    }
}
