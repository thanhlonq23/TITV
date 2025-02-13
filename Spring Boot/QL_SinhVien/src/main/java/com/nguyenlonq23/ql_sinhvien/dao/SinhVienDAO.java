package com.nguyenlonq23.ql_sinhvien.dao;

import com.nguyenlonq23.ql_sinhvien.entity.SinhVien;

import java.util.List;

public interface SinhVienDAO {
    List<SinhVien> getAll();

    SinhVien getById(int id);

    List<SinhVien> getByName(String name);

    SinhVien save(SinhVien sinhVien);

    SinhVien saveAndFlush(SinhVien sinhVien);

    void delete(int id);
}
