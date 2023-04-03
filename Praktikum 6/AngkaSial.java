/*
Nama File   : AngkaSial.Java 29/03/23
Pembuat     : Annisa Kumala Dewi - 24060121120025
Deskripsi   : Program penggunaan exception buatan sendiri
              Pengenalan klausa 'throw' dan 'throws'
Lab         : B1
*/


public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(16);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka!!!");
        }
    }
}

/*
Pertanyaan  : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jawab       : Baris ke 12 dan ke 21 pada AngkaSial tidak dapat dieksekusi karena adanya kebutuhan untuk membuat class exception
              Angka sial terlebih dahulu yang akan menjadi turunan dari class exception. Oleh karena itu perlu dibuat class exception dahulu sebelum menggerjakan baris tersebut. 
*/
