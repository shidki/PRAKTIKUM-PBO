/*
	Nama  File	: BangunDatarGeneric.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Deskripsi	: kelas konstruksi generic untuk bangun datar
*/
public class BangunDatarGeneric<T2 extends BangunDatar>{
	private T2 bangunDatar;
	
	public void set(T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T2 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	//mengganti T menjadi T2 dapat memberi nama parameter generic deskriptif sehingga 
	//saat menggunakan parameter generik lebih dari 1 di kelas tersebut dapat dibedakan
}

