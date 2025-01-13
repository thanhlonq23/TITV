public class Continue {
    public static void main(String[] args) {
        int max = 100;

        // for (int i = 0; i <= max; i++) {
        // if (i < 50) {
        // continue;
        // }
        // System.out.println(i);
        // }
        int i;
        for (int j = 0; j <= max; j++) {
            label: for (i = 0; i <= max; i++) {
                if (i < 50) {
                    continue label;
                }
                System.out.println("j = " + j + " || i = " + i);
            }
            System.out.println("j = " + j + " || i = " + i);
        }
        

    }
}
