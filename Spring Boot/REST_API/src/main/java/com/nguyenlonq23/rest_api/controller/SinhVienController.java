package com.nguyenlonq23.rest_api.controller;

import com.nguyenlonq23.rest_api.entity.ErrorResponse;
import com.nguyenlonq23.rest_api.entity.SinhVien;
import com.nguyenlonq23.rest_api.exception.SinhVienException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<SinhVien> getStudent(@PathVariable int tuoi, @PathVariable String khoa) throws SinhVienException {
        List<SinhVien> result = students.stream().filter(sv -> sv.getNganhHoc().equalsIgnoreCase(khoa) && sv.getTuoi() <= tuoi).collect(Collectors.toList());
        if (result.isEmpty()) {
            throw new SinhVienException("Không tìm thấy sinh viên nào");
        }

        result.sort(Comparator.comparing(SinhVien::getId));
        return result;
    }

    @GetMapping("/get/{index}")
    public SinhVien getStudent(@PathVariable int index) throws SinhVienException {
        SinhVien sv = null;
        try {
            sv = students.get(index);
        } catch (Exception e) {
            throw new SinhVienException("Không tìm thấy sinh viên nào");
        }
        return sv;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> catchError(SinhVienException e) {
        ErrorResponse er = new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> catchAllError(Exception e) {
        ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
    }
}
