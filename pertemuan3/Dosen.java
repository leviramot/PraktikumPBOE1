package pertemuan3;
/*  Nama file : Dosen.java
    Deskripsi : berisi atribut dan method dalam class Dosen
    Pembuat : Levi Ramot Siahaan
    Tanggal : 5 Maret 2026*/


public class Dosen{
    // Atribut
    private String Nama;
    private String NIP;
    private String Prodi;

    public Dosen (){
        this.Nama = " ";
        this.NIP = " ";
        this.Prodi = " ";
    }

    public Dosen (String Nama, String NIP, String Prodi) {
        this.Nama = Nama;
        this.NIP = NIP;
        this.Prodi = Prodi;
    }


    public void setNamaDosen (String Nama){
        this.Nama = Nama;
    }

    public void SetNIPDosen (String NIP){
        this.NIP = NIP;
    }

    public void setProdiDosen (String Prodi){
        this.Prodi = Prodi;
    }

    public String getNamaDosen() {
            return Nama;
    }

    public String getNIPDosen() {
            return NIP;
    }

    public String getProdiDosen() {
            return Prodi;
    }
}
