import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class App {
    static void copyAll(File f1, File f2) {
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (f1.isDirectory()) {
            File[] mangCon = f1.listFiles();
            try {
                for (File fx : mangCon) {
                    File file_new = new File(f2.getAbsolutePath() + "\\" + fx.getName());
                    copyAll(fx, file_new);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // File f0 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java
        // core\\Bai 70\\Thư mục\\file.txt");
        // File f1 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java
        // core\\Bai 70\\Thư mục\\file(1).txt");
        // File f2 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java
        // core\\Bai 70\\Thư mục\\file(2).txt");

        // // 1. Thay doi ten tap tin hoac thu muc

        // // * Su dung File de thay doi ten
        // f0.renameTo(f1);
        // // f1.renameTo(f0);

        
        // // * Su dung Files de thay doi ten
        // try {
        // // Files.move(f0.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // Files.move(f2.toPath(), f0.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }



        // // 2. Di chuyen file
        // File m = new File(
        // "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 70\\Thư
        // mục\\Thu muc 1\\move.txt");
        // File m_new = new File(
        // "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 70\\Thư
        // mục\\Thu muc 2\\move.txt");

        // try {
        // Files.move(m.toPath(), m_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // // Files.move(m_new.toPath(), m.toPath(),
        // StandardCopyOption.REPLACE_EXISTING);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }



        // // 3. Copy file
        // File c = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java
        // core\\Bai 70\\Thư mục\\Thu muc 3");
        // File c_new = new File(
        // "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 70\\Thư
        // mục\\Thu muc 4\\Thu muc 3_copy");

        // try {
        // Files.copy(c.toPath(), c_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // // Files.copy(c_new.toPath(), c.toPath(),
        // StandardCopyOption.REPLACE_EXISTING);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }



        // 4. CopyAll
        File c = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 70\\Thư mục\\Thu muc 3");
        File c_new = new File(
                "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 70\\Thư mục\\Thu muc 4\\Thu muc 3_copy");
                
        copyAll(c, c_new);
    }
}
