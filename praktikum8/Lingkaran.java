/*
	Nama  File	: Lingkaran.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Deskripsi	: implementasi lingkaran
*/
public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}