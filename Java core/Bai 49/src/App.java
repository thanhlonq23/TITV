import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print(" - Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("----------");

        // Ham length() ==> Lay do dai chuoi
        System.out.println("    + Do dai: " + s.length());
        int doDai = s.length();

        // Ham charAt(Vi tri) ==> Lay ra 1 ki tu tai vi tri
        for (int i = 0; i < doDai; i++) {
            System.out.println("    + Vi tri thu " + i + " la: " + s.charAt(i));
        }





        
        // Ham getChars(Vi tri bat dau, Vi tri ket thuc,
        // Mang du lieu, Vi tri bat dau luu cua mang)

        char[] b = new char[100];
        s.getChars(2, 4, b, 0);

        for (int i = 0; i < b.length; i++) {
            
        }
        sc.close();;
    }
}
