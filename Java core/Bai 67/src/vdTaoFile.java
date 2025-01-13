import java.io.File;
import java.io.IOException;

public class vdTaoFile {
    public static void main(String[] args) {

        // exists() ==> Kiểm tra thư mục có tồn tại
        File folder1 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 67");
        File folder2 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 68");
        System.out.println("Folder 1: " + folder1.exists());
        System.out.println("Folder 2: " + folder2.exists());

        // THƯ MỤC
        // mkdir() ==> Tạo thư mục
        File d1 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 67\\Directory_1");
        d1.mkdir();

        // mkdirs() ==> Tạo nhiều thư mục cùng lúc
        File d2 = new File(
                "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 67\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();

        // TÂP TIN (.exe .txt .doc ...)
        // createNewFile() ==> Tao tập tin
        File f1 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 67\\Directory_1\\text.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}