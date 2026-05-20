// file : Dosen.java
// deskripsi : Kelas Dosen turunan Civitasakademika, punya atribut NIP
// Nama : Levi Ramot Siahaan
// NIM  : 24060124140128

public class Dosen extends Civitasakademika {

    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    // getNomor return NIP untuk dosen
    @Override
    public String getNomor() {
        return nip;
    }
}