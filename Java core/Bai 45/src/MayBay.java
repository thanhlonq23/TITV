public class MayBay extends PhuongTienDiChuyen {

    public MayBay(String loaiPT, HangSX hangsx) {
        super(loaiPT, hangsx);
    }

    private String loaiNguyenLieu;

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    public void catCanh() {
        System.out.println("Bay len");
    }

    public void haCanh() {
        System.out.println("Bay xuong");
    }

    @Override
    public double layVanToc() {
        return 500;
    }

}
