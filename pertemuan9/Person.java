/*
	Nama  File	: Person.java
	Pembuat		: Muhamad Ridwan Ash'shidqi
	NIM			: 24060121130075
	Tanggal		: Sabtu, 10 Juni 2023
	Deskripsi	: Person database model
*/

public class Person {
    private int id;
    private String name;
    public Person(String n){
        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}