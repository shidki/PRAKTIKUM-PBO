/**
*File = MSegitiga.java
*Penulis = Muhamad Ridwan Ash'shidqi
*Nim = 24060121130075
*deskripsi = main dari segitiga.java
*/
package org.main;
import org.bangundatar.*; //import dari folder bangundatar dan .* adalah import dari semua isi di folder bangundatar
public class MSegitiga{
	public static void main(String[] args){
			Segitiga segitiga = new Segitiga(6,5,3);
			segitiga.PrintInfo();
			System.out.println("Luas segitiga adalah = " +segitiga.HitungLuas());	
	}
}
