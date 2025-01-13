import java.io.File;

public class Test_File {
    static File file = new File(
            "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 69\\Folder\\F1 - Sao Chép");

    // static void xoaFile(File fx) {
    //     if (fx.isFile()) {
    //         // Xoa neu la tap tin
    //         System.out.println("Đã xóa: " + fx.getAbsolutePath());
    //         fx.delete();
    //     } else if (fx.isDirectory()) {
    //         // Lay cac file con
    //         File[] file = fx.listFiles();
    //         for (File f1 : file) {
    //             // Xoa cac file con
    //             xoaFile(f1);
    //         }
    //         // Xoa ban than thu muc sau khi da xoa cac file con
    //         System.out.println("Đã xóa: " + fx.getAbsolutePath());
    //         fx.delete(); // ==> Xoa toan bo
    //         // fx.deleteOnExit(); // ==> Xoa de lai thu muc
    //     }
    // }

    static void xoaFile(File fx) {
        if (fx.delete() == true) {
            System.out.println("Da xoa: " + fx.getAbsolutePath());
        } else {
            File[] mangCon = fx.listFiles();
            for (File f1 : mangCon) {
                xoaFile(f1);
            }
        }
        System.out.println("Da xoa: " + fx.getAbsolutePath());
        fx.delete();
    }

    public static void main(String[] args) {
        /*
         * File f1 = new
         * File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 69\\Folder\\F1"
         * );
         * File f1_1 = new
         * File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 69\\Folder\\F1_1"
         * );
         * File f_vd = new
         * File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 69\\Folder\\vd.txt"
         * );
         * 
         * f1.deleteOnExit(); // ==> Khong xoa duoc vi chua thu muc/tap tin
         * f1_1.deleteOnExit(); //==> Xoa duoc
         * f_vd.deleteOnExit(); //==> Xoa duoc
         * System.out.println(f_vd.delete());
         */

        xoaFile(file);

    }
}
