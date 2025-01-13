package program;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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

    // 9
    public void outPut() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    // 10
    public void ghiDL(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (SinhVien sinhVien : danhSach) {
                oos.writeObject(sinhVien);
            }

            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 11
    public void docDLFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = null;
            while (is.available()>0) {
                Object oj = ois.readObject();
                if (oj == null) {
                    break;
                } else {
                    sv = (SinhVien) oj;
                    this.danhSach.add(sv);
                    System.out.println("Đã thêm " + sv + " vào danh sách");
                }
            }
            ois.close();
        } catch (EOFException e) {
            // Đã đọc hết tệp
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
