import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 1, gamechoice;
        double tkNguoiChoi = 500000;
        Locale lc = new Locale("vi", "VN");
        // NumberFormat nf = NumberFormat.getInstance(lc);
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

        while (choice == 1) {
            System.out.println("SỐ DƯ TÀI KHOẢN: " + nf.format(tkNguoiChoi));
            System.out.println(" * Nhập (1) để chơi\n * Nhập số bất kì để dừng chơi ");
            System.out.print("   - Lua chon: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("   + Nhap so tien cuoc: ");
                double tienCuoc = sc.nextDouble();

                while (tienCuoc == 0 || tienCuoc > tkNguoiChoi) {
                    System.out.println("  SỐ TIỀN ĐƯỢC NHẬP KHÔNG HỢP LỆ VUI LÒNG NHẬP LẠI !!!");
                    System.out.print("   + Nhap so tien cuoc: ");
                    tienCuoc = sc.nextDouble();
                }

                do {
                    System.out.println("\n   1.TÀI   2.XỈU");
                    System.out.print("   - Lua chon: ");
                    gamechoice = sc.nextInt();
                } while (gamechoice != 1 && gamechoice != 2);

                Random xx = new Random();
                int lan1 = xx.nextInt(5) + 1;
                int lan2 = xx.nextInt(5) + 1;
                int lan3 = xx.nextInt(5) + 1;
                int ketqua = lan1 + lan2 + lan3;

                System.out.println("\n   - Kết quả : " + lan1 + " " + lan2 + " " + lan3);
                System.out.println("   - Tổng : " + ketqua);

                if (ketqua >= 4 && ketqua <= 10 && gamechoice == 1) {
                    System.out.println("BẠN ĐÃ THẮNG");
                    tkNguoiChoi += tienCuoc;
                } else if (ketqua >= 11 && ketqua <= 17 && gamechoice == 2) {
                    System.out.println("BẠN ĐÃ THẮNG");
                    tkNguoiChoi += tienCuoc;
                } else {
                    System.out.println("BẠN ĐÃ THUA");
                    tkNguoiChoi -= tienCuoc;
                }
            }

            if (tkNguoiChoi == 0) {
                System.out.println("HẾT TIỀN !!! BẠN ĐÃ BỊ ĐÁ RA KHỎI TRÒ CHƠI =)))");
                choice = 0;
            }
        }
    }
}
