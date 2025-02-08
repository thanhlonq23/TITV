package com.nguyenlonq23.rest_api.entity;

public class SinhVien {
    public int id;
    public String ten;
    public int tuoi;
    public String nganhHoc;
    public double diemTB;

    public SinhVien(int id, String ten, int tuoi, String nganhHoc, double diemTB) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.nganhHoc = nganhHoc;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", nganhHoc='" + nganhHoc + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}

