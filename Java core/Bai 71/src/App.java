import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            PrintWriter pw = new PrintWriter(
                    "C:\\Users\\Nguyen Long\\Documents\\Code\\Java\\Java core\\Bai 71\\file.txt", "UTF-8");
            pw.print("Nguyễn Thành Long\n");
            pw.print(2003);
            pw.print(" ");
            pw.println("23 11");

            Student sv = new Student(2111, "Nguyễn Thành Long");
            pw.println(sv);     
    
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
