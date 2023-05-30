/*
	Nama  File	: ArrayListTest.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Deskripsi	: program penggunaan objek arraylist
*/
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
		//inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
        
    }
}
