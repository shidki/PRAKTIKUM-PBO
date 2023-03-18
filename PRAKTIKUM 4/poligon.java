/**
*File = poligon.java
*Penulis = Muhamad Ridwan Ash'shidqi
*deskripsi = representasi dasar dari objek poligon (segi banyak)
*/
package org.poligon;

public class poligon{
	protected int jumlahSisi;
	public poligon(){
		this.jumlahSisi = 0;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
}