public class App {
	public static void main(String[] args) throws Exception {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";

		// Hàm indexOf
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3));

		// Sử dụng vị trí bắt đầu (indexOf)
		System.out.println("\nVị trí của s2 trong s1 là: " + s1.indexOf(s2, 10));
		System.out.println("-------------------------");

		// Tìm kiếm char
		char c1 = 'ô';
		System.out.println("\nVị trí của c1 trong s1 là: " + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1, 20));
		System.out.println("-------------------------");

		// Hàm lastIndexof => tìm kiếm từ phải sang trái
		System.out.println("\nVị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));
		System.out.println("-------------------------");

		// tenFile = "Bai tap.excel.lop12.xls';

	}
}
