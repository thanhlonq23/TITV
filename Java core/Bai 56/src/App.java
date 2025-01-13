import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String a = "2 1 3 5 9 4 6 7 8 10";

        String[] b = a.split(" ");
        String[] c = a.split(" ", 2);
        System.out.println("B(Khong gioi han): " + Arrays.toString(b));
        System.out.println("C(Co gioi han): " + Arrays.toString(c));

        int[] A = new int[b.length];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(A);
        System.out.println("D: " + Arrays.toString(A));

        String X = "Xin chào,Tôi tên là Long.Tên đầy đủ Nguyễn Thành Long";

        String[] Y = X.split("\\.|\\,"); // ("\\.|\\,") dung de cat theo nhieu key khac nhau

        System.out.println(Arrays.toString(Y));


        String x = "Nguyễn Thành Long";
        String y[] = x.split(" ");
        System.out.println(" Ten: "+y[y.length-1]);


    }
}
