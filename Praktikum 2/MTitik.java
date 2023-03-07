/* Nama File	: MTitik.java
   Nama			: Annisa Kumala Dewi
   NIM			: 24060121120025
   Tanggal		: 1 Maret 2023
   Deskripsi	: Program yang berisi main dari Titik.java dan OperasiTitik.java
   Lab			: B1*/

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);	

		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);

		System.out.println("counter titik = "+t1.getCounterTitik());
		System.out.println("t1 = ("+ t1.getAbsis() + "," + " " + t1.getOrdinat() + ")"); 
		System.out.println("t2 = ("+ t2.getAbsis() + "," + " " + t2.getOrdinat() + ")"); 
		System.out.println("t3 = ("+ t3.getAbsis() + "," + " " + t3.getOrdinat() + ")"); 

		OperasiTitik op = new OperasiTitik();
		op.refleksiSumbuX(t1);
		System.out.println("t1 setelah refleksi Sumbu X = (" + t1.getAbsis() + "," + " " + t1.getOrdinat() + ")");

		/*op.refleksiSumbuX(t1);
		System.out.println("t1.setelah refleksi Sumbu Y  = (" + t1.getAbsis() + "," + " " + t1.getOrdinat() + ")");*/
	}

}