package mangobject;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien(150, "Nguyen Thanh Long", 8.4);
        SinhVien sv2 = new SinhVien(100, "Pham Nhat An", 7.4);
        SinhVien sv3 = new SinhVien(200, "Bui Bich Phuong", 8.4);
        SinhVien sv4 = new SinhVien(199, "Nguyen Van Binh", 8);

        System.out.println("Sv1 & Sv2: " + sv1.compareTo(sv2));  // (Phai Override compareTo trong du lieu SV de ss)
        System.out.println("Sv1 & Sv3: " + sv1.compareTo(sv3));
        System.out.println("Sv2 & Sv3: " + sv2.compareTo(sv3));
        
        // Hàm sắp xếp
        SinhVien[] a_sv = new SinhVien[] { sv1, sv2, sv3 };
        System.out.println("Truoc sắp xếp: " + Arrays.toString(a_sv));

        Arrays.sort(a_sv);
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));

        // Tìm kiếm
        System.out.println("Tìm kiếm Long: " + Arrays.binarySearch(a_sv, sv1));
        System.out.println("Tìm kiếm Binh: " + Arrays.binarySearch(a_sv, sv4));

    }
}
