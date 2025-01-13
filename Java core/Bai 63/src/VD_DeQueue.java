import java.util.ArrayDeque;
import java.util.Deque;

public class VD_DeQueue {
    public static void main(String[] args) {
        Deque<String> dsSV = new ArrayDeque<String>();
        /*
         * Có thể chèn/lấy ra dữ liệu theo 2 hướng (đầu-cuối) theo ý muốn
         */

        dsSV.offer("Nguyen Van A");
        dsSV.offer("Nguyen Van B");
        dsSV.offer("Lonq 1");
        dsSV.offer("Lonq 2");
        dsSV.offer("Nguyen Van C");
        dsSV.offerLast("Lonq 3");
        dsSV.offerFirst("Long 4");

        while (true) {
            String ten = dsSV.poll();
            // String ten = dsSV.pollLast();
            // String ten = dsSV.pollFirst();
            // String ten = dsSV.peek();

            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }

    }
}
