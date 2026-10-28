# Tugas 1 & Remedial UTS Praktikum PBO: Sistem Keanggotaan Gym FitTrack


## Identitas

* **Nama Tugas:** Remedial UTS Praktikum PBO / Tugas 1: Sistem Keanggotaan Gym FitTrack
* **Nama Lengkap:** Rafid Khaulika
* **NPM:** 250810701100016
* **Kelas Praktikum:** Praktikum Pemrograman Berorientasi Objek Kelas A

## Deskripsi Singkat

FitTrack adalah gym lokal dengan member aktif sekitar 150 member yang sebelumnya masih mencatat data keanggotaan secara manual di buku tulis sehingga rawan terjadinya data yang tercecer, sulit dibaca, dan lambat dicari saat jam operasional sibuk. Program berbasis Java ini dibuat sebagai langkah awal digitalisasi untuk mencatat data member di komputer resepsionis selama aplikasi berjalan. Fokus utama program ini adalah memvalidasi setiap data yang masuk, seperti nama, nomor telepon, tanggal daftar, dan jenis paket, dengan tujuan agar tidak ada kesalahan input yang membuat staf gagal menghubungi member.

## Fitur Utama

* **Pendaftaran Member Lengkap:** Staf resepsionis dapat mendaftarkan member baru dengan mengisi nama lengkap, nomor telepon, tanggal pendaftaran, dan memilih paket keanggotaan (berupa paket `Basic`, `Premium`, atau `VIP`).
* **Pendaftaran Cepat Tanpa Pilih Paket:** Staf dapat mendaftarkan member baru hanya dengan memasukkan nama, nomor telepon, dan tanggal daftar, di mana sistem otomatis mengatur paket keanggotaan ke `Basic`.
* **Pemeriksaan Format Data Otomatis:** Sistem secara otomatis menolak nama atau tanggal yang kosong/hanya berisi spasi, nomor telepon yang tidak diawali angka `0` atau kurang dari 10 digit, serta pilihan paket di luar `Basic`, `Premium`, dan `VIP`.
* **Perlindungan Data Member dari Perubahan Salah:** Apabila staf salah memasukkan data baru saat mengubah data member yang sudah terdaftar, sistem menampilkan pesan alasan penolakan yang jelas dan mempertahankan data lama yang sudah benar.
* **Pemberian Nilai Default yang Aman:** Kalau ada data yang salah ketik saat pertama kali mendaftarkan member baru, program tidak berhenti paksa melainkan tetap membuat data member dengan nilai cadangan (default) yang aman.
* **Tampilan Daftar Seluruh Member:** Staf dapat melihat seluruh daftar member yang tersimpan secara berurutan dengan tampilan berlabel yang rapi dan mudah dibaca.

## Konsep OOP yang Diterapkan

| Nama Konsep | Lokasi Penerapan (Class / Method) | Alasan Pemilihan Konsep |
| :--- | :--- | :--- |
| **Class dan Object** | Class `Member` dan pembuatan objek di `TesFitTrack.main()` | Mengelompokkan data seorang member (nama, nomor telepon, tanggal daftar, jenis paket) beserta perilakunya ke dalam satu kesatuan objek yang rapi. |
| **Encapsulation (Enkapsulasi)** | Atribut `private` (`nama`, `noTelepon`, `tanggalDaftar`, `jenisPaket`) serta method `public` getter dan setter di class `Member` | Melindungi atribut agar tidak bisa diubah sembarangan dari luar class tanpa melewati aturan validasi di dalam setter. |
| **Constructor Overloading & `this(...)`** | `Member(nama, noTelepon, tanggalDaftar, jenisPaket)` dan `Member(nama, noTelepon, tanggalDaftar)` | Memberikan fleksibilitas pembuatan objek (dengan atau tanpa input paket) serta menghindari duplikasi kode dengan meneruskan pemanggilan ke constructor utama memakai `this(...)`. |
| **Prinsip DRY (Don't Repeat Yourself) pada Validasi** | Pemanggilan `setNama()`, `setNoTelepon()`, `setTanggalDaftar()`, dan `setJenisPaket()` di dalam constructor `Member` | Memusatkan logika pemeriksaan data hanya di setter sehingga tidak perlu menulis ulang `if-else` yang sama di dalam constructor. |
| **Method Overriding (`toString()`)** | Method `public String toString()` pada class `Member` | Menggantikan representasi alamat memori bawaan Java menjadi teks berlabel yang rapi saat objek dicetak dengan `System.out.println()`. |

## Struktur Project

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

