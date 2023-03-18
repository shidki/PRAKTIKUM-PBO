/**
*File = BujurSangkar.java
*Penulis = Muhamad Ridwan Ash'shidqi
*Nim = 24060121130075
*deskripsi = representasi dasar dari BujurSangkar
*/
package org.bangundatar ;

import org.poligon.poligon ;

public class BujurSangkar extends poligon{
	private double panjangSisi ;
	
	public BujurSangkar(double panjangSisi){
		this.jumlahSisi = 4 ;
		this.panjangSisi = panjangSisi ;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi ;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi ;
	}
}
