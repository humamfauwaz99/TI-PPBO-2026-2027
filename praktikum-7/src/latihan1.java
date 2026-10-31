public class latihan1 {
    public static void main (String[] args ){
        Buku buku = new Buku("pemrograman java", "budi", 2024);
        System.out.println("judul buku: " + buku.getJudul());
        System.out.println("pengarang: " + buku.getpengarang());
        System.out.println(" tahun terbit: " + buku.getTahunterbit());
    }
}
