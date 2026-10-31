public class Buku {
    private String judul;
    private String pengarang;
    private int tahunterbit;

    public Buku(String judul, String pengarang, int tahunterbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }
    public String getJudul() {
        return judul;
    }
    public String getpengarang() {
        return pengarang;
    }
    public int getTahunterbit() {
        return tahunterbit;
    }
}
