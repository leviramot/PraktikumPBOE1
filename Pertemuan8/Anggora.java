// file : Anggora.java
// deskripsi : Kelas Anggora yang mewarisi kelas Kucing
// Nama : Levi Ramot Siahaan
// NIM  : 24060124130067

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Anggora) bergerak dengan melata anggun");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) bersuara : Meooong~!");
    }
}