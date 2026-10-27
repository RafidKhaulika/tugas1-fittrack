/**
 * Class utama untuk menguji sistem pendataan keanggotaan Gym FitTrack.
 * Menguji pembuatan objek Member, penyimpanan di dalam array,
 * cara kerja validasi pada constructor maupun setter, serta pencetakan data.
 */
public class TesFitTrack{

    public static final int JUMLAH_MEMBER = 4;

    /**
     * Menjalankan skenario pengujian objek Member sesuai ketentuan tugas.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args){
        Member[] daftarMember = new Member[JUMLAH_MEMBER];

        System.out.println("1. Membuat Objek Member");

        // Member 1 dibuat lewat constructor tanpa paket, sehingga otomatis berubah menjadi Basic
        daftarMember[0] = new Member("Fahril Gaming", "081234567890", "10-08-2026");
        // Member 2 dibuat lewat constructor lengkap dengan paket Premium
        daftarMember[1] = new Member("Fathir Hacker", "081234567891", "17-08-2026", "Premium");
        // Member 3 dibuat lewat constructor lengkap dengan paket VIP
        daftarMember[2] = new Member("Damanhuri", "081234567892", "05-09-2026", "VIP");
        // Member 4 sengaja memasukkan nomor telepon dan jenis paket yang salah
        System.out.println("Menguji pembuatan member ke-4 dengan data tidak valid:");
        daftarMember[3] = new Member("Rafid", "812345", "12-10-2026", "gold");

        System.out.println();
        System.out.println("2. Uji Setter Dengan Data Tidak Valid Pada Objek Yang Sudah Jadi");
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
        System.out.println("3. Daftar Seluruh Member FitTrack");
        for(int i = 0; i < daftarMember.length; i++){
            System.out.println("Data Member ke-" + (i + 1));
            System.out.println(daftarMember[i]);
            System.out.println("----------------------------------------");
        }
    }
}