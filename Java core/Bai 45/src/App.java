public class App {
    public static void main(String[] args) throws Exception {
        HangSX pt1 = new HangSX("Boing", "AUS");
        HangSX pt2 = new HangSX("Ford", "USA");
        HangSX pt3 = new HangSX("Thong Nhat", "Viet Nam");

        MayBay maybay = new MayBay("May Bay", pt1);
        Oto oto = new Oto("Oto", pt2);
        XeDap xedap = new XeDap("Xe dap", pt3);

        System.out.println("\n----------------------");

        // May Bay
        System.out.println("May bay :");
        maybay.batDau();
        maybay.catCanh();
        maybay.tangToc();
        maybay.haCanh();
        maybay.dungLai();
        System.out.println("  - Van toc: " + maybay.layVanToc() + "\n  - Hang sx: " + maybay.layTenHangSX());

        System.out.println("\n----------------------");
        // Oto
        System.out.println("Oto :");
        oto.batDau();
        oto.tangToc();
        oto.dungLai();
        System.out.println("  - Van toc: " + oto.layVanToc() + "\n  - Hang sx: " + oto.layTenHangSX());

        System.out.println("\n----------------------");
        // Xe dap
        xedap.batDau();
        xedap.tangToc();
        xedap.dungLai();
        System.out.println("  - Van toc: " + xedap.layVanToc() + "\n  - Hang sx: " + xedap.layTenHangSX());

    }
}
