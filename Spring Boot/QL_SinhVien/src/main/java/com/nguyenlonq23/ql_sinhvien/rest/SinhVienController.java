package com.nguyenlonq23.ql_sinhvien.rest;

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

    @GetMapping()
    public List<SinhVien> getAllSinhVien() {
        return service.getAllSinhVien();
    }

    @GetMapping("/{id}")
    public SinhVien getSinhVienById(@PathVariable int id) {
        return service.getSinhVienById(id);
    }

    @GetMapping("/name/{name}")
    public List<SinhVien> getSinhVienById(@PathVariable String name) {
    return service.getSinhVienByName(name);
    }

    @PostMapping()
    public ResponseEntity<SinhVien> saveSinhVien(@RequestBody SinhVien sv) {
        return service.saveSinhVien(sv);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SinhVien> saveAndFlushSinhVien(@PathVariable int id, @RequestBody SinhVien sv) {
        SinhVien existingStudent = service.getSinhVienById(id);
        if (existingStudent != null) {
            existingStudent.setEmail(sv.getEmail());
            existingStudent.setFirstName(sv.getFirstName());
            existingStudent.setLastName(sv.getLastName());
            service.saveAndFlushSinhVien(existingStudent);
            return ResponseEntity.ok(existingStudent);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void deleteSinhVien(@PathVariable int id) {
        service.deleteSinhVien(id);
    }

}
