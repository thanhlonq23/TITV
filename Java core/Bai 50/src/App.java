public class App {
    public static void main(String[] args) throws Exception {

        // compareTo ==> Cho ra 1 so nguyen am hoac duong dua tren bang ma ASCII '>' '<' '='
        String sv3 = "Nguyễn Văn";
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv4 = "Nguyễn Văn a";

        System.out.println("\n - Kiem tra chuoi bang compareTo: ");
        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

        // RegionMatches ==> So sanh giong equals va equalsIgnoreCase nhung theo doan
        // (Ung dung so sanh bien so xe, SDT....)
        String r1 = "NguyenLonq";
        String r2 = "Lonq";
        String r3 = "lonq";

        System.out.println("\n - Kiem tra chuoi bang RegionMathes: ");

        System.out.println("r1 vs r2 : " + r1.regionMatches(6, r2, 0, 4));
        System.out.println("r1 vs r3 (Phan biet) : " + r1.regionMatches(false, 6, r3, 0, 4));
        System.out.println("r1 vs r3 (Khong phan biet): " + r1.regionMatches(true, 6, r3, 0, 4));

        // startWith => Kiem tra chuoi bat dau
        String sdt = "098612345";
        System.out.println("\n - Kiem tra chuoi bat dau: ");
        System.out.println(sdt.startsWith("098"));
        System.out.println(sdt.startsWith("097"));

        System.out.println(sdt.startsWith("98", 1)); // toffset : Bu tru
        System.out.println(sdt.startsWith("98", 0));

        // endWith ==> Kiem tra chuoi ket thuc
        String file1 = "Java.PDF";
        System.out.println("\n - Kiem tra chuoi ket thuc: ");
        System.out.println(file1.endsWith(".PDF"));

        System.out.println(file1.endsWith(";PDF"));
        System.out.println(file1.endsWith("JPE"));

    }
}
