/*
NamaFile    : Lingkaran.java
Nama        : Annisa Kumala Dewi
NIM         : 24060121120025
Deskripsi   : Implementasi lingkaran sebagai bangun datar
*/

/*public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungkeliling(){
        return 2*jejari*3.14;
    }
}*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jejari;
    }
}
