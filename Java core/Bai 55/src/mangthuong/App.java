package mangthuong;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        int[] a = new int[] { 0, 5, 2, 1, 4, 3, 1, 9 };
        int[] b = new int[10];
        System.out.println("A ban dau: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("A sau khi sx: " + Arrays.toString(a));

        System.out.println("Vi tri cua 2 trong mang A: " + Arrays.binarySearch(a, 2));

        Arrays.fill(b, 6);

        System.out.println("B ban dau: " + Arrays.toString(b));

    }
}
