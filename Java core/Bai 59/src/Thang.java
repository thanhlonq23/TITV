public enum Thang {
    /*
     * enum được sử dụng khi biết trước được số lượng cố định của một đối tượng.
     * từ đó khi làm những dự án lớn có thể gọi ra để lấy dữ liệu từ nó
     * nhằm tiết kiệm thời gian thao tác
     */

    // Cac gia tri:
    Tháng_1(31),
    Tháng_2(29),
    Tháng_3(31),
    Tháng_4(30),
    Tháng_5(31),
    Tháng_6(30),
    Tháng_7(31),
    Tháng_8(31),
    Tháng_9(30),
    Tháng_10(31),
    Tháng_11(30),
    Tháng_12(31);

    // Bien
    private final int soNgay;

    // Constructors
    private Thang(int soNgay) {
        this.soNgay = soNgay;
    }

    // Ham getter
    public int getSoNgay() {
        return soNgay;
    }

}
