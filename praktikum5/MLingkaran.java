/**
/**
 * MLingkaran.java
 * Nama : Muhamad Ridwan Ash'shidqi
 * Nim : 24060121130075
 * Lab : PBO D1
 * Deskripsi : main lingkaran           
 * 
 */ 
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        double jari_jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari_jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}