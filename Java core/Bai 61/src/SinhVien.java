public class SinhVien implements Comparable<SinhVien> {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB;

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien(String maSV, String hoTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareToIgnoreCase(o.maSV);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        if (maSV == null) {
            if (other.maSV != null)
                return false;
        } else if (!maSV.equals(other.maSV))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
    }

    

}
