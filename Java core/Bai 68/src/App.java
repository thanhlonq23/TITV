import java.io.File;
import java.util.Scanner;

public class App {
    File file;
    static Scanner sc = new Scanner(System.in);

    // C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 68

    public void nhap() {
        System.out.print("Nhap duong dan: ");
        String f = sc.nextLine();
        this.file = new File(f);
    }

    public void checkThucThi() {
        System.out.println(file.canExecute());
    }

    public void checkRead() {
        System.out.println(file.canRead());
    }

    public void checkWrite() {
        System.out.println(file.canWrite());
    }

    public void printDuongDan() {
        System.out.println("Đường dẫn: " + file.getAbsolutePath());
    }

    public void printFileName() {
        System.out.println("Tên file: " + file.getName());
    }

    public void checkType() {
        if (file.isDirectory()) {
            System.out.println("   + Là thư mục");
        } else if (file.isFile()) {
            System.out.println("   + Là tập tin");
        }
    }

    public void inDsFileCon() {
        if (file.isDirectory()) {
            File[] f1 = file.listFiles();
            System.out.println("   + Danh sách file con trong thư mục: ");
            for (File f : f1) {
                System.out.println(f.getAbsolutePath());
            }
        } else if (file.isFile()) {
            System.out.println("   + Đây là tập tin, không có file con bên trong.");
        }
    }

    public void inCayThuMuc() {
        inChiTietChayThuMuc(this.file, 1);
    }

    public void inChiTietChayThuMuc(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.print("|___");
        System.out.println(f.getName());

        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietChayThuMuc(fx, level + 1);
            }
        }
    }

    public void menu() {
        int choice;
        nhap();
        do {
            System.out.println("MENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình.");
            System.out.print("  - Nhập lưa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkThucThi();
                    break;
                case 2:
                    checkRead();
                    break;
                case 3:
                    checkWrite();
                    break;
                case 4:
                    printDuongDan();
                    break;
                case 5:
                    printFileName();
                    break;
                case 6:
                    checkType();
                    break;
                case 7:
                    inDsFileCon();
                    break;
                case 8:
                    inCayThuMuc();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình thành công !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hơp lệ !!! Vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        App a = new App();
        a.menu();
    }
}
