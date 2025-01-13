import java.util.Scanner;
import java.util.Stack;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<String> stackChuoi = new Stack<String>();

        /*
         * - stackChuoi.push("giatri"); ==> Đưa giá trị vào stack
         * - stackChuoi.size("giatri") ==> Độ lớn của stack
         * - stackChuoi.pop() ==> Lấy giá trị ra, Xóa khỏi stack (long => gnol)
         * - stackChuoi.peek() ==> Lấy giá trị ra, Không xóa khỏi stack (long => gggg)
         * - stackChuoi.clear(); ==> Xóa tất cả phần tử trong stack
         * - stackChuoi.contains("giatri") ==> Xác định giá trị có tồn tại trong stack
         *   hay không
         */

        // VD đảo ngược chuỗi
        System.out.print(" - Nhập vào chuỗi: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.print("Chuỗi đảo ngược: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }

        // VD2: Chuyển từ hệ thập phân sang hệ nhị phân
        Stack<String> stack = new Stack<String>();
        System.out.print("\n - Nhập số nguyên dương: ");
        int n = sc.nextInt();

        while (n > 0) {
            int sodu = n % 2;
            stack.push(sodu + "");
            n = n / 2;
        }

        System.out.print("\nSố nhị phân: ");
        int m = stack.size();
        for (int i = 0; i < m; i++) {
            System.out.print(stack.pop());
        }

        // while (stack.size() != 0) {
        // System.out.print(stack.pop());
        // }
    }
}
