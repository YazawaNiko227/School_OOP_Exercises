package exercise05;

public class TestCD {
    public static void main(String[] args) {
        ListCD listCD = new ListCD();

        CompactDisk cd1 = new CompactDisk(100001, "Nhac Tre", 10, 150000);
        CompactDisk cd2 = new CompactDisk(100002, "Bolero", 8, 120000);
        CompactDisk cd3 = new CompactDisk(100003, "Rock Viet", 12, 180000);
        CompactDisk cd4 = new CompactDisk(100004, "Nhac Trinh", 9, 130000);

        listCD.addCD(cd1);
        listCD.addCD(cd2);
        listCD.addCD(cd3);
        listCD.addCD(cd4);

        System.out.println("Danh sach CD ban dau:");
        listCD.ShowCD();

        System.out.println("\nSap xep tang dan theo tieu de:");
        listCD.AcsByTitle();
        listCD.ShowCD();

        System.out.println("\nSap xep giam dan theo gia:");
        listCD.DesByPrices();
        listCD.ShowCD();

        System.out.printf("\nTong gia tri cac CD: %,.0f VND\n", listCD.sumPricesOfCD());
    }
}
