package app.andropath.com.recyclerviewexample;

public class Personil {

    private String nama;
    private String umur;
    private String lokasi;

    public Mahasiswa(String nama, String umur, String lokasi) {
        this.nama = nama;
        this.umur = umur;
        this.lokasi = lokasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
