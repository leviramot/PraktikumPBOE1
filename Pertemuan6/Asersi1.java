/**
 * File        : Asersi1.java
 * Deskripsi   : Program untuk menunjukkan asersi
 * Nama        : Levi Ramot Siahaan
 * NIM         : 24060124130067
 * Tanggal     : 1 April 2026
 */
public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}