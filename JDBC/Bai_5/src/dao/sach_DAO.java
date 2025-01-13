package dao;

import java.util.ArrayList;

import model.Sach;

public class sach_DAO implements DAO_Interface<Sach> {

    public static sach_DAO getInstance(){
        return new sach_DAO();
    }
    
    @Override
    public int insert(Sach t) {
        return 0;
    }

    @Override
    public int update(Sach t) {
        return 0;
    }

    @Override
    public int delete(Sach t) {
        return 0;
    }

    @Override
    public ArrayList<Sach> selectALL() {
        return null;
    }

    @Override
    public Sach selectById(Sach t) {
        return null;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        return null;
    }
    



    
}
