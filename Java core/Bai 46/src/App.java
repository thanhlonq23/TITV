

public class App {
    public static void main(String[] args) {

        // Phan mem may tinh
        System.out.print("\n\nTest c: ");
        PhanMemMT pm1 = new PhanMemMT();

        System.out.println("2+3=" + pm1.cong(2, 3));

        double[] c = new double[] { 1, 5, 3, 6, 2, 4, 3, 7 };

        System.out.print("\nC: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }

        pm1.SapXepTang(c);
        System.out.println("\n  - Sau khi sap xep tang");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }

    }
}
