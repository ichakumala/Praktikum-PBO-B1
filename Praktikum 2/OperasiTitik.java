/* Nama File	: MTitik.java
   Nama			: Annisa Kumala Dewi
   NIM			: 24060121120025
   Tanggal		: 1 Maret 2023
   Deskripsi	: Kelas yang berisi program untuk mengeksekusi/menampilkan Titik.java
   Lab			: B1*/

class OperasiTitik{
	public void refleksiSumbuX(Titik titik){
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiSumbuY(Titik titik){
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}
