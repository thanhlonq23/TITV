package com.nguyenthanhlong.hibernateandjpa.dao;

import com.nguyenthanhlong.hibernateandjpa.entity.SinhVien;

import java.util.List;

public interface SinhVienDAO {
    List<SinhVien> getAll();

    SinhVien getById(int id);

    void save(SinhVien sinhVien);

    void update(SinhVien sinhVien);

    void delete(int id);

}
