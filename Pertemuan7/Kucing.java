// file : Kucing.java
// deskripsi : Kelas anak Kucing yang mewarisi Anabul, bergerak melata dan bersuara meong
// Nama : Levi Ramot Siahaan
// NIM  : 24060124130067

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara : Meong!");
    }
}