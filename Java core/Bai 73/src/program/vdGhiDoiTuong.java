package program;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class vdGhiDoiTuong {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 73\\Thu Muc\\file.data");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("001", "Nguyễn Thành Long", 2003, 9);
            oos.writeObject(sv);

            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
