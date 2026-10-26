/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini untuk menyimpan data pribadi member dan memastikan
 * setiap perubahan data lolos validasi sebelum disimpan.
 */
public class Member{

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

    /**
     * Membuat objek Member baru dengan seluruh atribut lengkap.
     * Pengisian nilai dilakukan lewat setter agar tetap melalui validasi.
     *
     * @param nama untuk nama lengkap member
     * @param noTelepon untuk nomor telepon aktif member
     * @param tanggalDaftar untuk tanggal pertama kali member mendaftar
     * @param jenisPaket untuk jenis paket keanggotaan seperti Basic, Premium, atau VIP
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket){
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat objek Member baru tanpa menentukan jenis paket.
     * Jenis paket otomatis diatur menjadi Basic.
     *
     * @param nama untuk nama lengkap member
     * @param noTelepon untuk nomor telepon aktif member
     * @param tanggalDaftar untuk tanggal pertama kali member mendaftar
     */
    public Member(String nama, String noTelepon, String tanggalDaftar){
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }

    /**
     * Mengambil nama lengkap member.
     *
     * @return nama lengkap member saat ini
     */
    public String getNama(){
        return this.nama;
    }

    /**
     * Mengambil nomor telepon aktif member.
     *
     * @return nomor telepon member saat ini
     */
    public String getNoTelepon(){
        return this.noTelepon;
    }

    /**
     * Mengambil tanggal pertama kali member mendaftar.
     *
     * @return tanggal daftar member saat ini
     */
    public String getTanggalDaftar(){
        return this.tanggalDaftar;
    }

    /**
     * Mengambil jenis paket keanggotaan member.
     *
     * @return jenis paket member saat ini (Basic, Premium, atau VIP)
     */
    public String getJenisPaket(){
        return this.jenisPaket;
    }

    /**
     * Mengubah nama lengkap member setelah memeriksa apakah nama kosong.
     * Jika nama kosong atau hanya berisi spasi, nama lama dipertahankan
     * dan pesan penolakan dicetak.
     *
     * @param nama untuk nama lengkap baru yang tidak boleh kosong atau hanya spasi
     */
    public void setNama(String nama){
        if(nama != null && !nama.trim().isEmpty()){
            this.nama = nama;
        }else{
            System.out.println("Penolakan: Nama member tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param noTelepon untuk nomor telepon baru, wajib diawali angka 0
     *                  dan memiliki panjang minimal 10 digit
     */
    public void setNoTelepon(String noTelepon){
        if(noTelepon != null && noTelepon.startsWith(AWALAN_TELEPON) && noTelepon.length()>= PANJANG_MIN_TELEPON){
            this.noTelepon = noTelepon;
        }else{
            System.out.println("Penolakan: Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
        }
    }

    /**
     * Mengubah tanggal daftar member setelah memastikan nilainya tidak kosong.
     * Jika kosong atau hanya berisi spasi, tanggal lama dipertahankan
     * dan pesan penolakan dicetak.
     *
     * @param tanggalDaftar untuk tanggal pendaftaran baru (contoh: 17-08-2026)
     */
    public void setTanggalDaftar(String tanggalDaftar){
        if(tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()){
            this.tanggalDaftar = tanggalDaftar;
        }else{
            System.out.println("Penolakan: Tanggal daftar tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    /**
     * Mengubah jenis paket keanggotaan member setelah memeriksa pilihan paket.
     * Hanya menerima Basic, Premium, atau VIP dengan penulisan persis.
     * Jika tidak sesuai, paket lama dipertahankan dan pesan penolakan dicetak.
     *
     * @param jenisPaket untuk jenis paket baru (Basic, Premium, atau VIP)
     */
    public void setJenisPaket(String jenisPaket){
        if(jenisPaket != null && (jenisPaket.equals(PAKET_BASIC) || jenisPaket.equals(PAKET_PREMIUM) || jenisPaket.equals(PAKET_VIP))){
            this.jenisPaket = jenisPaket;
        }else{
            System.out.println("Penolakan: Jenis paket harus Basic, Premium, atau VIP (penulisan harus persis).");
        }
    }

    /**
     * Menghasilkan teks berisi seluruh data member dengan label yang rapi.
     *
     * @return representasi String dari data objek Member
     */
    @Override
    public String toString(){
        return "Nama           : " + this.nama + "\n" + "No. Telepon    : " + this.noTelepon + "\n" + "Tanggal Daftar : " + this.tanggalDaftar + "\n" + "Jenis Paket    : " + this.jenisPaket;
    }
}