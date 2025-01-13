import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Test_Files {
    static File f1t = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 69\\Folder\\F1 - Sao Chép");

    public static void xoaFile(File f) {
        if (f.isFile()) {
            // Xoa neu la tap tin
            System.out.println("Đã xóa: " + f.getAbsolutePath());
            try {
                Files.deleteIfExists(f.toPath());
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (f.isDirectory()) {
            // Lay cac file con
            File[] file = f.listFiles();

            for (File f1 : file) {
                // Xoa cac file con
                xoaFile(f1);
            }
            // Xoa ban than thu muc sau khi da xoa cac file con
            System.out.println("Đã xóa: " + f.getAbsolutePath());
            try {
                Files.deleteIfExists(f.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test_Files.xoaFile(f1t);
    }
}
