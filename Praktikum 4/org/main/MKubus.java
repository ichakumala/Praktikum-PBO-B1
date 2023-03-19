/* File      : MPoligon.java 15/03/2023
   Penulis   : Annisa Kumala Dewi
   Deskripsi : Driver class untuk poligon dan bujur sangkar serta kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(9);
		
		Kubus kubus = new Kubus(persegi);

		System.out.println("Volume Kubus :" + kubus.hitungVolume());
		
		System.out.println("Luas Alas Kubus :" + kubus.hitungLuasAlas());
	}
}