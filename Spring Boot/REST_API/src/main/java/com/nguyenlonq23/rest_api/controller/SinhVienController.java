package com.nguyenlonq23.rest_api.controller;

import com.nguyenlonq23.rest_api.entity.SinhVien;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        students.add(new SinhVien(4, "Long4", 23, "CNTT", 5));
        students.add(new SinhVien(5, "Long5", 25, "CNTT", 8));
    }

    @GetMapping("/all")
    public List<SinhVien> getAllStudents() {
        return students;
    }

    @GetMapping("/get/{tuoi}/{khoa}")
    public List<SinhVien> getStudent(@PathVariable int tuoi, @PathVariable String khoa) {
        List<SinhVien> result = students.stream().filter(sv -> sv.getNganhHoc().equalsIgnoreCase(khoa)  && sv.getTuoi() <= tuoi).collect(Collectors.toList());
        result.sort(Comparator.comparing(SinhVien::getId));
        return result;
    }
}
