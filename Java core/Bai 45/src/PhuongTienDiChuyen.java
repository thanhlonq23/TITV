public abstract class PhuongTienDiChuyen {
    protected String loaiPT;
    protected HangSX hangsx;

    public PhuongTienDiChuyen(String loaiPT, HangSX hangsx) {
        this.loaiPT = loaiPT;
        this.hangsx = hangsx;
    }

    public String getLoaiPT() {
        return loaiPT;
    }

    public void setLoaiPT(String loaiPT) {
        this.loaiPT = loaiPT;
    }

    public HangSX getHangsx() {
        return hangsx;
    }

    public void setHangsx(HangSX hangsx) {
        this.hangsx = hangsx;
    }

    public String layTenHangSX() {
        return hangsx.getTenHangSX();
    }

    public void batDau() {
        System.out.println("Khoi dong");
    }

    public void tangToc() {
        System.out.println("Dap ga");
    }

    public void dungLai() {
        System.out.println("Stop");
    }

    public abstract double layVanToc();
}
