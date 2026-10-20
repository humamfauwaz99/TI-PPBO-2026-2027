public class Buku {
    String judul;
    String pengarang;
    int TahunTerbit;

    public Buku (String judul, String pengarang, int TahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.TahunTerbit = TahunTerbit;
    }
    public void tampildata(){
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("tahhun terbit: " + TahunTerbit);
    }
}
