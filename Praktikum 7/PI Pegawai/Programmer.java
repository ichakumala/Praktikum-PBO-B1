/*
File    : Programmer.java  
Pembuat : Annisa Kumala Dewi/24060121120025
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}