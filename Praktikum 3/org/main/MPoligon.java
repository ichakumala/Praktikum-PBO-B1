/* File      : MPoligon.java 08/03/2023
   Penulis   : Annisa Kumala Dewi
   Deskripsi : Driver class untuk poligon dan persegi panjang serta segitiga
*/

package org.main;

import org.bangundatar.*;

/*public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
    }
}*/

public class MPoligon{
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(10,5,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga :"+segitiga.hitungLuas());
    }
}