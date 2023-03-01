/* Nama File	: MTitik.java
   Nama		: Annisa Kumala Dewi
   NIM		: 24060121120025
   Tanggal	: 22 Febuari 2022
   Deskipsi	: Kelas yang berisi program utama yang memanfaatkan kelas Titik
   Lab		: B1*/

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

		System.out.println("t1.x ="+t1.getAbsis()); 
		System.out.println("t1.y ="+t1.getOrdinat());
		
		System.out.println("t2.x ="+t2.getAbsis());
		System.out.println("t2.y ="+t2.getOrdinat());
		
		System.out.println("t3.x ="+t3.getAbsis());
		System.out.println("t3.y ="+t3.getOrdinat());

		System.out.println("counter titik = "+t1.getCounterTitik());
	}
}
