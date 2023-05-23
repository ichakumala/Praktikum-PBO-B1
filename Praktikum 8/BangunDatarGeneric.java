/*
NamaFile    : BangunDatarGeneric.java
Nama        : Annisa Kumala Dewi
NIM         : 24060121120025
Deskripsi   : Kelas konstruksi generic bangun datar
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*
Jika "T" diganti mengganti karakter lain seperti "T1", maka segala kemunculan
"T" menjadi T1. Karena hal tersebut akan mempengaruhi deklarasi kelas, method, variabel, 
dan parameter yang menggunakan parameter tipe generic. Selain itu semua penggunaan "T"
dalam parameter metode, variabel lokal, dan pemanggilan metode juga harus diganti dengan 
karakter baru seperti "T1" atau lainnya sesuai dengan perubahan yang dilakukan.
Penggantian karakter perlu dilakukan secara konsisten agar tidak ada kesalahan program.
*/



