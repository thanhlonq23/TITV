public class Box<T, S> {
    private T ten;
    private S tuoi;

    public Box(T ten, S tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public T getTen() {
        return ten;
    }

    public void setTen(T ten) {
        this.ten = ten;
    }

    public S getTuoi() {
        return tuoi;
    }

    public void setTuoi(S tuoi) {
        this.tuoi = tuoi;
    }

}
