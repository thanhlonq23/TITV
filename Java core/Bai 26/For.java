public class For {
    public static void main(String[] args) {
         int out, in = 0;

        // for (out = 0; out < 10; out++) {
        //     for (in = 0; in < 20; in++) {
        //         if (in > 10) {
        //             break;
        //         }
        //     }
        //     System.out.println("Vong lap ben trong: Out = " + out + " || In = " + in + "");
        // }
        // System.out.println("Vong lap ben ngoai: Out = " + out + " || In = " + in);


        label: for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10) {
                    break label;
                }
            }
            System.out.println("Vong lap ben trong: Out = " + out + " || In = " + in + "");
        }
        System.out.println("Vong lap ben ngoai: Out = " + out + " || In = " + in);

    }
}
