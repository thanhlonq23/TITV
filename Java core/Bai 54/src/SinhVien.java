public class SinhVien implements Comparable<SinhVien> {
    private int maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien(int maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public int compareTo(SinhVien o) {
        String ten1 = this.getTen();
        String ten2 = o.getTen();
        return ten1.compareTo(ten2);
    }

    // @Override
    // public int compareTo(SinhVien o) {
    // if (this.diemTB - o.diemTB > 0) {
    // return 1;
    // } else if (this.diemTB - o.diemTB < 0) {
    // return -1;
    // }
    // return 0;
    // }

    public String getTen() {
        String s = this.hoTen.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        } else {
            return s;
        }
    }

    
}
