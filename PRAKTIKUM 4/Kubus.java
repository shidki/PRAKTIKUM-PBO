/**
*File = Kubus.java
*Penulis = Muhamad Ridwan Ash'shidqi
*Nim = 24060121130075
*deskripsi = representasi dasar dari Kubus
*/
package org.bangunruang ;

import org.bangundatar.BujurSangkar ;

public class Kubus {
	private BujurSangkar permukaan ;
	public Kubus(BujurSangkar permukaan){
		 this.permukaan = permukaan ;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi * panjangSisi ;
	}

	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi ;
	}
}

