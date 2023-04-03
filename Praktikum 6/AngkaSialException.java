/*
Nama File   : AngkaSialException.Java 29/03/23
Pembuat     : Annisa Kumala Dewi - 24060121120025
Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
Lab         : B1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan masukkan angka 13 karena angka sial !!!");
    }
}
