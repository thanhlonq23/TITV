import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutTham_HashSet {
    // Tap hop

    Set<String> thungPhieuThuong = new HashSet<String>();

    static Scanner sc = new Scanner(System.in);

    public void themPhieu() {
        System.out.print(" - Nhap ma phieu: ");
        String phieu = sc.nextLine();
        thungPhieuThuong.add(phieu);
    }

    public void xoaPhieu() {
        System.out.print(" - Nhap ma phieu: ");
        String phieu = sc.nextLine();
        thungPhieuThuong.remove(phieu);
    }

    public boolean kTraTonTai() {
        System.out.print(" - Nhap ma phieu: ");
        String phieu = sc.nextLine();
        return thungPhieuThuong.contains(phieu);
    }

    public void xoaAllPhieu() {
        thungPhieuThuong.clear();
    }

    public int soLuongPhieu() {
        return thungPhieuThuong.size();
    }

    public void rutTham() {
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuThuong.size());
        String ketQua = (String) thungPhieuThuong.toArray()[viTri];
        System.out.println(ketQua);
    }

    public void printAll() {
        System.out.print(thungPhieuThuong);
    }

    public static void main(String[] args) {
        int choice = 1;
        RutTham_HashSet rt = new RutTham_HashSet();

        while (choice != 0) {
            System.out.println("--------------------------------------");
            System.out.println("MENU: ");
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");

            System.out.print(" - Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    rt.themPhieu();
                    break;
                case 2:
                    rt.xoaPhieu();
                    break;
                case 3:
                    System.out.println("Phieu co ton tai hay khong: " + rt.kTraTonTai());
                    break;
                case 4:
                    rt.xoaAllPhieu();
                    break;
                case 5:
                    System.out.println("   + So luong phieu: " + rt.soLuongPhieu());
                    break;
                case 6:
                    rt.rutTham();
                    break;
                case 7:
                    rt.printAll();
                    break;
                case 0:
                    System.out.println("Thoat khoi chuong trinh thanh cong");
                    return;
                default:
                    System.out.println(" Lua chon khong hop le vui long chon lai");
                    break;
            }

        }
    }
}
