/**
 * Lingkaran.java
 * Nama : Muhamad Ridwan Ash'shidqi
 * Nim : 24060121130075
 * Lab : PBO D1
 * Deskripsi : lingkaran   
 * 
 */ 
 //mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
 }
 
 