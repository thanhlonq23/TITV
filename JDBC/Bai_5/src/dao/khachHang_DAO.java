package dao;

import java.util.ArrayList;

import model.KhachHang;

public class khachHang_DAO implements DAO_Interface<KhachHang> {

    public static khachHang_DAO getInstance(){
        return new khachHang_DAO();
    }

    @Override
    public int insert(KhachHang t) {
        return 0;
    }

    @Override
    public int update(KhachHang t) {
        return 0;
    }

    @Override
    public int delete(KhachHang t) {
        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectALL() {
        return null;
    }

    @Override
    public KhachHang selectById(KhachHang t) {
        return null;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        return null;
    }
    


    
}
