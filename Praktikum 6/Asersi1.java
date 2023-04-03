/*
Nama File   : Asersi1.Java 29/03/23
Pembuat     : Annisa Kumala Dewi - 24060121120025
Deskripsi   : Program untuk menentukan asersi
Lab         : B1
*/

public class Asersi1{
    public static void main (String[] agrs){
        int x = 0;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
