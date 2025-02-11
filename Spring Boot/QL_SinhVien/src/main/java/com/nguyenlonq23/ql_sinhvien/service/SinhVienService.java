package com.nguyenlonq23.ql_sinhvien.service;

import com.nguyenlonq23.ql_sinhvien.entity.SinhVien;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SinhVienService {

    public List<SinhVien> getAllSinhVien();

    public SinhVien getSinhVienById(int id);

    public List<SinhVien> getSinhVienByName(String name);

    public ResponseEntity<SinhVien> saveSinhVien(SinhVien sv);

    public ResponseEntity<SinhVien> saveAndFlushSinhVien(SinhVien sv);

    public void deleteSinhVien(SinhVien sinhvien);
}