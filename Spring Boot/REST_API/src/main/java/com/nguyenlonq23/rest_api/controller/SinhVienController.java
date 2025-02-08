package com.nguyenlonq23.rest_api.controller;

import com.nguyenlonq23.rest_api.entity.SinhVien;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {
    public List<SinhVien> students;

    @PostConstruct
    public void createList() {
        students = new ArrayList<SinhVien>();
        students.add(new SinhVien(1, "Long", 21, "CNTT", 8));
        students.add(new SinhVien(2, "Long2", 22, "KE", 7));
        students.add(new SinhVien(3, "Long3", 23, "QLD", 6));
        students.add(new SinhVien(4, "Long4", 24, "NNA", 5));
        students.add(new SinhVien(5, "Long5", 25, "MT", 8));
    }

    @GetMapping("/all")
    public List<SinhVien> getAllStudents() {
        return students;
    }
}
