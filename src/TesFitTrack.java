public class TesFitTrack {

    public static final int JUMLAH_MEMBER = 4;

    public static void main(String[] args) {
        Member[] daftarMember = new Member[JUMLAH_MEMBER];

        System.out.println("=== 1. MEMBUAT OBJEK MEMBER ===");
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "10-08-2026");
        daftarMember[1] = new Member("Siti Aminah", "085211223344", "17-08-2026", "Premium");
        daftarMember[2] = new Member("Andi Pratama", "081399887766", "05-09-2026", "VIP");

        System.out.println("Menguji pembuatan member ke-4 dengan data tidak valid:");
        daftarMember[3] = new Member("Rina Wati", "812345", "12-10-2026", "Gold");

        System.out.println();
        System.out.println("=== 2. UJI SETTER DENGAN DATA TIDAK VALID PADA OBJEK YANG SUDAH JADI ===");
        System.out.println("Data nomor telepon Member 1 sebelum diubah : " + daftarMember[0].getNoTelepon());
        System.out.println("Mencoba mengubah nomor telepon Member 1 menjadi '08123' (kurang dari 10 digit):");
        daftarMember[0].setNoTelepon("08123");
        System.out.println("Data nomor telepon Member 1 setelah ditolak: " + daftarMember[0].getNoTelepon());

        System.out.println();
        System.out.println("Data nama Member 2 sebelum diubah : " + daftarMember[1].getNama());
        System.out.println("Mencoba mengubah nama Member 2 menjadi spasi kosong '   ':");
        daftarMember[1].setNama("   ");
        System.out.println("Data nama Member 2 setelah ditolak: " + daftarMember[1].getNama());

        System.out.println();
        System.out.println("=== 3. DAFTAR SELURUH MEMBER FITTRACK ===");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("Data Member ke-" + (i + 1));
            System.out.println(daftarMember[i]);
            System.out.println("----------------------------------------");
        }
    }
}