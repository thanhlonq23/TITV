public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Nguyen";
        String s2 = "Thanh";

        String s3 = s1 + s2;
        System.out.println("s3: " + s3);
        System.out.println("\n=================\n");
        // Ham concat ==> Noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s4: " + s4);
        System.out.println("\n=================\n");

        // Ham replace (Kí tự) ==> Dung khi can thay the ki tu
        String a1 = "TITV.vn is a very good website";
        String replaceString1 = a1.replace('t', 'j');// thay thế tất cả ký tự 't' thành 'j'
        System.out.println(replaceString1);
        System.out.println("\n=================\n");
        // replace (Chuỗi) ==> Nen dung replaceAll de thay the
        String a2 = "My name is Long my name is java";
        String replaceString2 = a2.replace("is", "was");// thay thế tất cả chuỗi "is" to "was"
        System.out.println(replaceString2);
        System.out.println("\n=================\n");
        // replaceFirst (Chỉ thay thế kí tự đầu tiên)
        String a3 = "This website providing free tutorials";
        String replaceFirst = a3.replaceFirst("s", "9");
        System.out.println(replaceFirst);
        System.out.println("\n=================\n");
        // replaceAll (Thay the tat ca ki tu)
        String a4 = "My name are Long my name is java";
        String replaceAll = a4.replaceAll("are", "is");
        System.out.println(replaceAll);
        System.out.println("\n=================\n");

        // Hàm toLowerCase ==> Chuyển về viết thường
        String b1 = "XIn cHaO CaC bAn";
        System.out.println(b1.toLowerCase());
        // Hàm toUpperCase (Chuyển về viết hoa)
        b1 = "XIn cHaO CaC bAn";
        System.out.println(b1.toUpperCase());
        System.out.println("\n=================\n");

        // Hàm trim ==> Xóa khoảng trắng dư thừa ở đầu & cuối chuỗi
        String c1 = "    Xin chao cac ban toi ten là        ";
        System.out.println(c1.trim() + ":");
        System.out.println("\n=================\n");

        // Hàm subString (Cắt chuỗi con) ==> Copy 1 chuỗi con từ chuỗi ban đầu
        String d1 = "Xin chào các bạn, mình là Thành Long";
        String d2 = d1.substring(10);
        String d3 = d1.substring(11, 18);
        System.out.println(d2);
        System.out.println(d3);

    }
}
