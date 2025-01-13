import java.util.PriorityQueue;
import java.util.Queue;

public class VD_PrioriQueue {
    public static void main(String[] args) {
        Queue<String> dsSV = new PriorityQueue<String>();
        /*
         * Mỗi lần chèn dữ liệu sẽ sắp xếp lại dữ liệu theo thứ tự (Nhỏ->Lớn)
         * (Nếu dùng kiểu DL opject thì phải tạo hàm compare)
         */

        // So sánh theo chữ cái đầu
        dsSV.offer("Nguyen Van C");
        dsSV.offer("Anh Nguyen");
        dsSV.offer("Quynh Nguyen");
        dsSV.offer("Nguyen Van B");
        dsSV.offer("Nguyen Van A");

        while (true) {
            String ten = dsSV.poll(); // ==> Lấy ra xong xóa
            // String ten = dsSV.peek(); // ==> Lấy ra nhưng không xóa

            if (ten == null) {
                break;
            }
            System.out.println(ten);

        }

    }
}
