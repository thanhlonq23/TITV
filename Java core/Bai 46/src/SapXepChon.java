
public class SapXepChon implements SapXepInterface {
    @Override
    public void SapXepGiam(double[] a) {
        int n = a.length;
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++)
                if (a[j] > a[min_idx])
                    min_idx = j;
            double temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }

    }

    @Override
    public void SapXepTang(double[] a) {
        int n = a.length;
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            double temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

}
