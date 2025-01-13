
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        // currentTimeMillis ==> Lay thoi gian hien tai tinh tu 01/01/1970
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Truoc for: " + t1);
        System.out.println("Sau for: " + t2);
        System.out.println("Khoang TG t1 - t2 la: " + (t2 - t1));
        System.out.println("---------------------------------");

        // TimeUnit ==> Chuyen doi don vi thoi gian
        long phut = 5;
        System.out.println(phut + " Phut = " + TimeUnit.MINUTES.toSeconds(phut) + "s");
        System.out.println("---------------------------------");

        // Date
        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);
        System.out.println("Ngay " + d1.getDate() + " Thang " + (d1.getMonth() + 1) +
                " Nam " + (d1.getYear() + 1900));
        System.out.println("---------------------------------");

        // Calendar
        Calendar c1 = Calendar.getInstance();
        System.out.println("Ngay " + c1.get(Calendar.DATE) + " Thang " + (c1.get(Calendar.MONTH) + 1) + " Nam "
                + c1.get(Calendar.YEAR));
        System.out.println("---------------------------------");
        // add ==> + - Calendar (Thay doi cac kieu thoi gian khac)
        c1.add(Calendar.DATE, 32);
        System.out.println("Ngay " + c1.get(Calendar.DATE) + " Thang " + (c1.get(Calendar.MONTH) + 1) + " Nam "
                + c1.get(Calendar.YEAR));

        // Calendar.getInstance;

        // roll ==> + - Calendar (Chi thay doi kieu duoc chon)
        c1.roll(Calendar.DATE, 31);

        System.out.println("Ngay " + c1.get(Calendar.DATE) + " Thang " + (c1.get(Calendar.MONTH) + 1) + " Nam "
                + c1.get(Calendar.YEAR));
        System.out.println("---------------------------------");

        // DateFormat ==> Duoc chon dinh dang thoi gian (dd/MM/yyyy...)
        DateFormat D1 = new SimpleDateFormat();
        System.out.println(D1.format(t1));

        D1 = new SimpleDateFormat("E dd MMMMM yyyy hh:mm:ss a");
        System.out.println(D1.format(t1));

        D1 = new SimpleDateFormat("yyyy.MMMMM.dd hh:mm:ss a");
        System.out.println(D1.format(t1));

    }
}
