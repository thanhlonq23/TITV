public class App {
    public static void main(String[] args) throws Exception {
        ToaDo td1 = new ToaDo(1, 2);
        ToaDo td2 = new ToaDo(3, 4);
        ToaDo td3 = new ToaDo(5, 6);

        // Hinh hinh0 = new Hinh(); => Loi bien dich
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhChuNhat(td2, 5, 4);
        Hinh h3 = new HinhTron(td3, 5);

        System.out.println("DT1 = " + h1.tinhDienTich());
        System.out.println("DT2 = " + h2.tinhDienTich());
        System.out.println("DT3 = " + h3.tinhDienTich());
    }
}
