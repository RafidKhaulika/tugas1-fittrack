public class Member {

    public static final int PANJANG_MIN_TELEPON = 10;
    public static final String AWALAN_TELEPON = "0";

    public static final String PAKET_BASIC = "Basic";
    public static final String PAKET_PREMIUM = "Premium";
    public static final String PAKET_VIP = "VIP";

    public static final String DEFAULT_NAMA = "Member Baru";
    public static final String DEFAULT_NO_TELEPON = "0800000000";
    public static final String DEFAULT_TANGGAL_DAFTAR = "16-10-2026";
    public static final String DEFAULT_JENIS_PAKET = PAKET_BASIC;

    private String nama = DEFAULT_NAMA;
    private String noTelepon = DEFAULT_NO_TELEPON;
    private String tanggalDaftar = DEFAULT_TANGGAL_DAFTAR;
    private String jenisPaket = DEFAULT_JENIS_PAKET;

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    public String getNama() {
        return this.nama;
    }

    public String getNoTelepon() {
        return this.noTelepon;
    }

    public String getTanggalDaftar() {
        return this.tanggalDaftar;
    }

    public String getJenisPaket() {
        return this.jenisPaket;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Penolakan: Nama member tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null
                && noTelepon.startsWith(AWALAN_TELEPON)
                && noTelepon.length() >= PANJANG_MIN_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("Penolakan: Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
        }
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println("Penolakan: Tanggal daftar tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket != null && (jenisPaket.equals(PAKET_BASIC) || jenisPaket.equals(PAKET_PREMIUM) || jenisPaket.equals(PAKET_VIP))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Penolakan: Jenis paket harus Basic, Premium, atau VIP (penulisan harus persis).");
        }
    }

}