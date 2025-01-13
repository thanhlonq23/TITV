public class PhanMemMT implements MayTinhBoTuiInterface, SapXepInterface {

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

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }

}
