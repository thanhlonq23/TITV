
public class SapXepChen implements SapXepInterface {

    @Override
    public void SapXepGiam(double[] a) {
        int j;
        double t;
        for (int i = 1; i < a.length; i++) {
            j = i - 1;
            t = a[i];
            while (j >= 0 && t > a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t; // Chèn
        }

    }

    @Override
    public void SapXepTang(double[] a) {
        int j;
        double t;
        for (int i = 1; i < a.length; i++) {
            j = i - 1;
            t = a[i];
            while (j >= 0 && t < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t; // Chèn
        }

    }

}
