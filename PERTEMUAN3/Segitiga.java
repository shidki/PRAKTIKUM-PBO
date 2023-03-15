/**
*File = Segitiga.java
*Penulis = Muhamad Ridwan Ash'shidqi
*Nim = 24060121130075
*deskripsi = representasi dasar dari segitiga
*/

package org.bangundatar;

import org.poligon.poligon; //import dari file poligon.java dan dari folder poligon
public class Segitiga extends poligon{
	private double alas,tinggi;
	public Segitiga(double alas,double tinggi,int JumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.JumlahSisi = JumlahSisi;
	}
	public double HitungLuas(){
		return 0.5 * alas * tinggi;
	}
	public void PrintInfo(){
		System.out.println("Bangun segitiga Bersisi = "+this.getJumlahSisi());
	}
}
