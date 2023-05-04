/*
	Nama  File	: vehicle.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Deskripsi	: Superclass yang digunakan untuk menghitung harga sewa kendaraan
*/
package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
