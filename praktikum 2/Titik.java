/*
	File		: OperasiTitik.java
	Penulis 	: Muhamad Ridwan Ash'shidqi - 24060121130075
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas titik.
*/
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	Titik(int a, int b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
 }
 
 
 