import java.util.Map;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> data = new TreeMap<String, String>();

    public String themTu(String tuKhoa, String yNghia) {
        return this.data.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.data.remove(tuKhoa);
    }

    public void traNghia(String tuKhoa) {
        String yNghia = this.data.get(tuKhoa);
        System.out.println("   + Ý nghĩa của " + tuKhoa + " là: " + yNghia);
    }

    public void inDsTuKhoa() {
        System.out.println(data);
    }

    public int SLTuKhoa() {
        return data.size();
    }

    public void xoaAllTuKhoa() {
        data.clear();
    }
}
