import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class dsSinhVien {
    private ArrayList<SinhVien> danhSach;

    public dsSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public dsSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public ArrayList<SinhVien> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1
    public void themSV(SinhVien sv) {
        this.danhSach.add(sv);
    }

    // 2
    public boolean kiemTraRong() {
        if (this.danhSach.isEmpty()) {
            return true;
        }
        return false;
    }

    // 3
    public int getSoLuong() {
        return this.danhSach.size();
    }

    // 4
    public void lamRong() {
        this.danhSach.clear();
    }

    // 5
    public boolean kTraSVTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    // 6
    public void xoaSV(SinhVien sv) {
        this.danhSach.remove(sv);
    }

    // 7
    public void findSV(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    // 8
    public void sxDiemTB() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                } else if (sv1.getDiemTB() > sv2.getDiemTB()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public void outPut() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println("    + Mã sinh viên: " + sinhVien.getMaSV());
            System.out.println("    + Họ tên: " + sinhVien.getHoTen());
            System.out.println("    + Năm sinh: " + sinhVien.getNamSinh());
            System.out.println("    + Điểm trung bình: " + sinhVien.getDiemTB() + "\n\n");

        }
    }
}
