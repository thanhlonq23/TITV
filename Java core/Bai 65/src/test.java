import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập chuỗi: ");
        String a = sc.nextLine();
        String b = a;
        System.out.println("Chuỗi: " + b);
        System.out.println(b.length());

    }
}