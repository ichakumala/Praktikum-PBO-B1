/* Nama File	: Titik.java
   Nama		: Annisa Kumala Dewi
   NIM		: 24060121120025
   Tanggal	: 22 Februari 2023
   Deskripsi	: Program yang berisi kelas Titik
   Lab		: B1*/

class Titik {
	Double absis;
	Double ordinat;
	static int counterTitik;

	Titik(){
		counterTitik++;
	}

	void setAbsis(Double a){
		absis = a;
	}

	void setOrdinat(Double o){
		ordinat = o;
	}

	Double getAbsis(){
		return absis;
	}

	Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik (){
		return counterTitik;
	}
}
