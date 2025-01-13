import java.util.LinkedList;
import java.util.Queue;

public class VD_Queue {
    public static void main(String[] args) {
        Queue<String> dsSV = new LinkedList<String>();
        /*
         * Sắp xếp theo kiểu hàng đợi(Xếp hàng) cái gì đến trước thì ra trước và ngược
         * lại...
         */

        dsSV.offer("Nguyen Van A");
        dsSV.offer("Lonq 1");
        dsSV.offer("Nguyen Van B");
        dsSV.offer("Nguyen Van C");

        while (true) {
            String ten = dsSV.poll(); // ==> Lấy ra xong xóa
            // String ten = dsSV.peek(); ==> Lấy ra nhưng không xóa

            if (ten == null) {
                break;
            }
            System.out.println(ten);

        }

    }
}
