public class Oto extends PhuongTienDiChuyen {

    public Oto(String loaiPT, HangSX hangsx) {
        super(loaiPT, hangsx);
    }

    private String loaiNguyenLieu;

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }

}
