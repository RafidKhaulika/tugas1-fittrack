public class TesFitTrack {

    public static final int JUMLAH_MEMBER = 4;

    public static void main(String[] args) {
        Member[] daftarMember = new Member[JUMLAH_MEMBER];

        System.out.println("=== 1. MEMBUAT OBJEK MEMBER ===");
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "10-08-2026");
        daftarMember[1] = new Member("Siti Aminah", "085211223344", "17-08-2026", "Premium");
        daftarMember[2] = new Member("Andi Pratama", "081399887766", "05-09-2026", "VIP");
        daftarMember[3] = new Member("Rina Wati", "082144556677", "12-10-2026", "Basic");

        System.out.println();
        System.out.println("=== DAFTAR SELURUH MEMBER FITTRACK ===");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("Data Member ke-" + (i + 1));
            System.out.println(daftarMember[i]);
            System.out.println("----------------------------------------");
        }
    }
}