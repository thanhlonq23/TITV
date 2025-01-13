package test;

import dao.user_DAO;
import model.User;

public class TestUser {
    public static void main(String[] args) {
        // User u = new User("u1", "678", "Nguyen Van E");
        // user_DAO.getInstance().insert(u);

        // User u = new User("abc", "", "");
        // System.out.println(user_DAO.getInstance().selectById(u));

        // User u1 = new User("aba", "1111", "Nguyễn Văn B");
        User u1 = new User("aa OR 1=1; -- ", "1111", "Nguyễn Văn B");
        System.out.println(user_DAO.getInstance().selectById(u1));

        // user_DAO.getInstance().insert(u1);
    }
}
