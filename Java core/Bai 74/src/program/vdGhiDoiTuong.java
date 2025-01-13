package program;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class vdGhiDoiTuong {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 74\\Thu Muc\\file.data");
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = (SinhVien) ois.readObject();

            System.out.println(sv);
            // ois.readObject(sv);

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}   
