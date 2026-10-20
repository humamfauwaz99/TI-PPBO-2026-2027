public class Buku {
    String judul;
    String pengarang;
    int tahunterbit;

    public Buku (String judul, String pengarang, int tahunterbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }

    public void tampilkandata() {
        System.out.println("judul : " + judul);
        System.out.println("pengarang : " + pengarang);
        System.out.println("tahun terbit : " + tahunterbit);
    }
}
