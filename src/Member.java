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

}