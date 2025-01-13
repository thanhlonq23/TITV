package C;

import java.util.Date;

import A.Test;

public class App {
    public static void main(String[] args) throws Exception {
        Test t = new Test();
        B.Test t1 = new B.Test();
        Date d = new Date(0, 0, 0, 0, 0, 0);

        t1.outPut();

    }
}