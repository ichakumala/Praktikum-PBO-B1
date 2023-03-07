/* Nama File	: Titik.java
   Nama			: Annisa Kumala Dewi
   NIM			: 24060121120025
   Tanggal		: 1 Maret 2023
   Deskripsi	: Program yang berisi kelas Titik.java
   Lab			: B1*/

class Titik {
	private Double absis;
	private Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;
	}

	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o){
		ordinat = o;
	}

	public Double getAbsis(){
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik (){
		return counterTitik;
	}
}