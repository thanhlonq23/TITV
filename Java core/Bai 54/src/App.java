public class App {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien(150, "Nguyen Thanh Long", 8.4);
        SinhVien sv2 = new SinhVien(100, "Pham Nhat An", 7.4);
        SinhVien sv3 = new SinhVien(200, "Bui Bich Phuong", 8.4);

        System.out.println("Sv1 & Sv2: " + sv1.compareTo(sv2));
        System.out.println("Sv1 & Sv3: " + sv1.compareTo(sv3));
        System.out.println("Sv2 & Sv3: " + sv2.compareTo(sv3));

    }
}
