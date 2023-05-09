/*
File    : Pegawai.java
Pembuat : Annisa Kumala Dewi/24060121120025
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Pegawai {
    String nama;
    int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : "+nama + ", Gaji Pokok : " + gajiPokok);
    }
}