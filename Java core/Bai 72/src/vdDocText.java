import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class vdDocText {
    public static void main(String[] args) {
        // Cách 1: BufferedReader (Đọc dữ liệu từng dòng một) ==> Nên dùng khi dữ liệu quá lớn tránh ngốn RAM
        /* 
        File f = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 72\\Thu Muc\\text.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


        // Cách 2: Files (Đọc toàn bộ 1 lúc) ==> Nên dùng nếu dữ liệu nhẹ
        File f1 = new File("C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 72\\Thu Muc\\text.txt");

        try {
            List<String> allText = Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
