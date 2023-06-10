import java.util.ArrayList;

/*
	Nama  File	: LambdaList.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Tanggal		: Sabtu, 10 Juni 2023
	Deskripsi	: Implementasi lambda pada List, digunakan sebagai parameter pada method
*/

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}