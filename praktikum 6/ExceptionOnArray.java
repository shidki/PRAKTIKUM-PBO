/**
 * File      : ExceptionOnArray.java
 * Nama : MUhamad Ridwan Ash'shidqi
 * NIM : 24060121130075
 * NIM : 24060121130075
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 *
 */
 
 public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
 }