/*
	File		: OperasiTitik.java
	Penulis 	: Muhamad Ridwan Ash'shidqi - 24060121130075
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas titik.
*/
public class OperasiTitik{
	private static void RefleksiSumbuX(Titik titik){
		double x;
		x = titik.getOrdinat();
		x *= -1;
		titik.setOrdinat(x);
	}
	private static void RefleksiSumbuY(Titik titik){
		double y;
		y = titik.getAbsis();
		y *= -1;	
		titik.setAbsis(y);
	}
	public double RefleksiX(Titik titik){
		double a;
		RefleksiSumbuX(titik);
		a = titik.getOrdinat();
		return a;
	}
	public double RefleksiY(Titik titik){
		double b;
		RefleksiSumbuY(titik);
		b = titik.getAbsis();
		return b;
	}
}