package com.nguyenlonq23.ql_sinhvien.service;

import com.nguyenlonq23.ql_sinhvien.dao.SinhVienDAO;
import com.nguyenlonq23.ql_sinhvien.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    private final SinhVienDAO sinhVienDAO;

    @Autowired
    public SinhVienServiceImpl(SinhVienDAO sinhVienDAO) {
        this.sinhVienDAO = sinhVienDAO;
    }

    @Override
    public List<SinhVien> getAllSinhVien() {
        return sinhVienDAO.getAll();

    }

    @Override
    public SinhVien getSinhVienById(int id) {
        return sinhVienDAO.getById(id);

    }

    @Override
    public List<SinhVien> getSinhVienByName(String name) {
        return sinhVienDAO.getByName(name);
    }

    @Override
    @Transactional
    public ResponseEntity<SinhVien> saveSinhVien(SinhVien sv) {
        if (sinhVienDAO.save(sv) == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(sv);
    }

    @Override
    @Transactional

    public ResponseEntity<SinhVien> saveAndFlushSinhVien(SinhVien sv) {
        if (sinhVienDAO.saveAndFlush(sv) == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(sv);
    }

    @Override
    @Transactional
    public void deleteSinhVien(int id) {
        sinhVienDAO.delete(id);
    }
}
