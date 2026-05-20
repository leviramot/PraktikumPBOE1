/**
 * File        : ExceptionOnArray.java
 * Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
 * Nama        : Levi Ramot Siahaan
 * NIM         : 24060124130067
 * Tanggal     : 1 April 2026
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