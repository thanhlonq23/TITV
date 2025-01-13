public class Test {
    /*
     * enum được sử dụng khi biết trước được số lượng cố định của một đối tượng.
     * từ đó khi làm những dự án lớn có thể gọi ra để lấy dữ liệu từ nó
     * nhằm tiết kiệm thời gian thao tác
     */
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_1 = new ThoiKhoaBieu(Day.Monday, "Toan");
        System.out.println(tkb_1);

        int x = Thang.Tháng_1.getSoNgay();
        System.out.println(x);

    }
}
