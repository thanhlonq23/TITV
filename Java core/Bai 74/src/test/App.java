package test;

import program.SinhVien;
import program.dsSinhVien;

import java.io.File;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    dsSinhVien dsSV = new dsSinhVien();

    public void themSV() {
        System.out.print("  - Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("  - Nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.print("  - Nhap nam sinh: ");
        int namSinh = sc.nextInt();
        System.out.print("  - Nhap diem TB: ");
        double diemTB = sc.nextDouble();

        SinhVien sv = new SinhVien(maSV, hoten, namSinh, diemTB);
        dsSV.themSV(sv);
    }

    public void kTraRong() {
        if (dsSV.kiemTraRong()) {
            System.out.println("   - Danh sach rong");
        } else {
            System.out.println("   - Danh sach khong rong");
        }
    }

    public void getSoLuong() {
        System.out.println("   - So luong sinh vien trong danh sach: " + dsSV.getSoLuong());
    }

    public void clearDS() {
        dsSV.lamRong();
    }

    public void kTraSVTonTai() {
        System.out.print("   - Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        SinhVien sv = new SinhVien(maSV);
        if (dsSV.kTraSVTonTai(sv)) {
            System.out.println("     + Sinh vien co ton tai");
        } else {
            System.out.println("     + Sinh vien khong ton tai");
        }
    }

    public void xoaSV() {
        System.out.print("   - Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        SinhVien sv = new SinhVien(maSV);
        dsSV.xoaSV(sv);
    }

    public void findSV() {
        System.out.print("   - Nhap ten Sv muon tim kiem: ");
        String ten = sc.nextLine();
        dsSV.findSV(ten);
    }

    public void sapXep() {
        dsSV.sxDiemTB();
    }

    public void xuatDs() {
        System.out.println("   - Danh sach sinh vien(Sap xep diem tu cao den thap):");
        dsSV.outPut();
    }

    public void outPut() {
        dsSV.outPut();
    }

    public void ghiDL() {
        System.out.println(
                "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 74\\Thu Muc\\dulieu.data");
        System.out.print(" - Nhap ten file: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        dsSV.ghiDL(file);
    }

    public void docDLTuFile() {
        System.out.println(
                "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 74\\Thu Muc\\dulieu.data");
        System.out.print(" - Nhap ten file: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        dsSV.docDLFile(file);
    }

    public void menu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\n\n<=================================MENU===================================>"
                    + "\n|   0. Thoát khỏi chương trình                                           |"
                    + "\n|   1. Thêm sinh viên vào danh sách                                      |"
                    + "\n|   2. Kiểm tra danh sách có rỗng hay không?                             |"
                    + "\n|   3. Lấy ra số lượng sinh viên trong danh sách                         |"
                    + "\n|   4. Làm rỗng danh sách sinh viên                                      |"
                    + "\n|   5. Kiểm tra sinh viên có tồn tại trong danh sách(MÃ SINH VIÊN)       |"
                    + "\n|   6. Xóa sinh viên ra khỏi danh sách(MÃ SINH VIÊN)                     |"
                    + "\n|   7. Tìm kiếm tất cả sinh viên dựa trên tên được nhập vào từ bàn phím  |"
                    + "\n|   8. Xuất ra danh sách sinh viên có điểm từ cao đến thấp               |"
                    + "\n|   9. In danh sách sinh viên                                            |"
                    + "\n|   10. Ghi xuống File                                                   |"
                    + "\n|   11. Đọc File                                                         |"
                    + "\n<========================================================================>");

            System.out.print(" * Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    themSV();
                    break;
                case 2:
                    kTraRong();
                    break;
                case 3:
                    getSoLuong();
                    break;
                case 4:
                    clearDS();
                    break;
                case 5:
                    kTraSVTonTai();
                    break;
                case 6:
                    xoaSV();
                    break;
                case 7:
                    findSV();
                    break;
                case 8:
                    sapXep();
                    xuatDs();
                    break;
                case 9:
                    outPut();
                    break;
                case 10:
                    ghiDL();
                    break;
                case 11:
                    docDLTuFile();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình thành công");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ !!! Vui lòng nhập lại: ");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.menu();
    }
}
