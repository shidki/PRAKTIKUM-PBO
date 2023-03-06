/*
	File		: OperasiTitik.java
	Penulis 	: Muhamad Ridwan Ash'shidqi - 24060121130075
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas titik.
*/
class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik op = new OperasiTitik();
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
		//REFLEKSI SUMBU X
		System.out.println("Titik : (" + t.getAbsis() + "," + op.RefleksiX(t) + ")" );
		//REFLEKSI SUMBU Y
		System.out.println("Titik : (" + op.RefleksiY(t) + "," + t.getOrdinat() + ")" );
		//HASIL AKHIR TITIK T
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
	}
}
