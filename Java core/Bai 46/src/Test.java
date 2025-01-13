public class Test {
    public static void main(String[] args) {
        System.out.println("Test a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhBoTuiVinacal mvn500 = new MayTinhBoTuiVinacal();

        System.out.println("5 + 3 = " + mfx500.cong(5, 3));
        System.out.println("4 * 5 = " + mvn500.nhan(4, 5));
        System.out.println("4 / 0 = " + mfx500.chia(4, 0));

        System.out.println("Test b: ");

        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        double[] a = new double[] { 1, 4, 3, 6, 2, 2, 7, 8, 5 };
        double[] b = new double[] { 5, 2, 7, 3, 6, 9, 4, 7, 3 };

        System.out.print("A: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\nB: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }

        System.out.println("\n-------------------------");

        // SX chen
        System.out.println("  - Sap xep chen: ");
        sxchen.SapXepGiam(a);
        sxchen.SapXepTang(b);
        System.out.print(" + SX giam:   ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\n + SX tang:   ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + ", ");
        }

        System.out.println("\n-------------------------");
        // SX chon
        System.out.println(" - Sap xep chon: ");
        sxchon.SapXepGiam(a);
        sxchon.SapXepTang(b);
        System.out.print(" + SX giam:   ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\n + SX tang:   ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}
