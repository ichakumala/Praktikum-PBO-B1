/*
NamaFile    : ArrayList.java
Nama        : Annisa Kumala Dewi
NIM         : 24060121120025
Deskripsi   : Program penggunaan objek Array List sebagai collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat berisi objek String    
        ArrayList<String> strings = new ArrayList<String>();
        
        // menambah elemem
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        //menghapus elemen
        strings.remove("praktikum");
        
        //iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s+" ");
        }
    }
}
