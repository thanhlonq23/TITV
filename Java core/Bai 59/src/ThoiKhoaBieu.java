public class ThoiKhoaBieu {
    private Day thu;
    private String monHoc;

    public ThoiKhoaBieu(Day thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu [thu=" + thu + ", monHoc=" + monHoc + "]";
    }

}
