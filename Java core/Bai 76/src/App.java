import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        String sourceFile = "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 76\\Thu Muc\\test.txt";
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 76\\Thu Muc\\compressed.zip");
                
        ZipOutputStream zipOut = new ZipOutputStream(fos);

        File fileToZip = new File(sourceFile);
        FileInputStream fis = new FileInputStream(fileToZip);

        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }

        zipOut.close();
        fis.close();
        fos.close();
    }
}
