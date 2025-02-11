package com.nguyenlonq23.ql_sinhvien.controller;

import com.nguyenlonq23.ql_sinhvien.entity.SinhVien;
import com.nguyenlonq23.ql_sinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class SinhVienController {
    private final SinhVienService service;

    @Autowired
    public SinhVienController(SinhVienService service) {
        this.service = service;
    }

    @RequestMapping("/all")
    public List<SinhVien> getAllSinhVien() {
        return service.getAllSinhVien();
    }

    @RequestMapping("/id/{id}")
    public SinhVien getSinhVienById(@PathVariable int id) {
        return service.getSinhVienById(id);
    }

    @RequestMapping("/name/{name}")
    public List<SinhVien> getSinhVienById(@PathVariable String name) {
        return service.getSinhVienByName(name);
    }

    @PostMapping("/save")
    public ResponseEntity<SinhVien> saveSinhVien(@RequestBody SinhVien sv) {
        return service.saveSinhVien(sv);
    }

    @PostMapping("/saveandflush/{sv}")
    public ResponseEntity<SinhVien> saveAndFlushSinhVien(@PathVariable SinhVien sv) {
        return service.saveAndFlushSinhVien(sv);
    }

    @DeleteMapping("/delete/{sinhvien}")
    public void deleteSinhVien(@PathVariable SinhVien sinhvien) {
        service.deleteSinhVien(sinhvien);
    }

}
