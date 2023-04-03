/*
Nama File   : Asersi2.Java 29/03/23
Pembuat     : Annisa Kumala Dewi - 24060121120025
Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
Lab         : B1
*/

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] agrs){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " 
            +kelilingLingkaran);

    }
}

/*
Pertanyaan  : Ada yang kurang dari Asersi2 diatas?
Jawab       : Pada sintaks "jari - jari > 0" salah, karena sintaks yang benar yaitu "jari - jari != 0"
              Alasan dari penggunaan sintaks "jari - jari != 0" yaitu agar nilai positif serta negatif dapat dijalankan. 
              Dan dilakukan pemerikasaan bahwa jari - jari yang dimasukkan bukan nol. 
*/
