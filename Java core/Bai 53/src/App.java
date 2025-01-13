import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] n = new int[] { 1, 2, 3 };

        // Cach 1
        int[] n1 = n;
        n1[0] = 110;
        System.out.println("n : " + Arrays.toString(n));
        System.out.println("n1 : " + Arrays.toString(n1));
        System.out.println("\n-------------------\n");

        // Cach 2: Dung ham clone
        int[] n2 = n.clone();
        n2[0] = 1;

        System.out.println("n : " + Arrays.toString(n));
        System.out.println("n2 : " + Arrays.toString(n2));
        System.out.println("\n-------------------\n");

        // Cach 3: Dung ham System.arraycopy
        int[] n3 = new int[n.length];
        System.arraycopy(n, 1, n3, 1, n.length - 1); // (mang nguon,vi tri bd nguon,mang copy,vi tri bd copy,soluong)

        System.out.println("n : " + Arrays.toString(n));
        System.out.println("n3 : " + Arrays.toString(n3));
        System.out.println("\n-------------------\n");
    }
}
