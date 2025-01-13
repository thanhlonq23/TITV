package model;

import java.sql.Date;

public class KhachHang {
    private String id;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String id) {
        this.id = id;
    }

    public KhachHang(String id, String hoTen, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public KhachHang(String id, String hoTen, Date ngaySinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang [id=" + id + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
    }

}
