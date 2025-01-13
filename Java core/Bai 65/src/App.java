import java.util.Scanner;

public class App {
    TuDien td = new TuDien();
    static Scanner sc = new Scanner(System.in);

    public void themTu() {
        System.out.print(" - Nhap tu khoa: ");
        String tuKhoa = sc.nextLine();
        System.out.print(" - Nhap y nghia: ");
        String yNghia = sc.nextLine();
        td.themTu(tuKhoa, yNghia);
    }

    public void xoaTu() {
        System.out.print(" - Nhap tu khoa: ");
        String tuKhoa = sc.nextLine();
        td.xoaTu(tuKhoa);
    }

    public void traNghia() {
        System.out.print(" - Nhap tu khoa: ");
        String tuKhoa = sc.nextLine();
        td.traNghia(tuKhoa);
    }

    public void inDs() {
        System.out.println("Danh sach:");
        td.inDsTuKhoa();
    }

    public void inSLTuKhoa() {
        System.out.println("So luong tu khoa: " + td.SLTuKhoa());
    }

    public void xoaAll() {
        td.xoaAllTuKhoa();
    }

    public void menu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("---------------");
            System.out.println("MENU ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n");
            System.out.print(" - Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    themTu();
                    break;
                case 2:
                    xoaTu();
                    break;
                case 3:
                    traNghia();
                    break;
                case 4:
                    inDs();
                    break;
                case 5:
                    inSLTuKhoa();
                    break;
                case 6:
                    xoaAll();
                    break;
                case 0:
                    System.out.println("Thoat khoi chuong trinh thanh cong");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !!!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        App a = new App();
        a.menu();
    }
}
