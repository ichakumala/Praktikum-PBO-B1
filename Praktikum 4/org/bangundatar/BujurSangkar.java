/* File         : BujurSangkar.java 15/03/2023
   Penulis      : Annisa Kumala Dewi
   Deskripsi    : Representasi dari objek bujur sangkar, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;


public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * jumlahSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}

    /*public void printInfo(){
        System.out.println("Bangun Bujur Sangkar Bersisi" +this.getJumlahSisi());
    }*/
}