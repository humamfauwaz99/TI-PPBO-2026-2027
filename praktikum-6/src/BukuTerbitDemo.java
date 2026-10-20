public class BukuTerbitDemo {
    public static void main(String[] args) {
        Buku[] daftarbuku = new Buku[4];

        daftarbuku[0] = new Buku ("java dasar", "andi", 2014);
        daftarbuku[1] = new Buku ("basis data", "budi", 2018);
        daftarbuku[2] = new Buku ("struktus data", "citra", 2020);
        daftarbuku[3] = new Buku ("pemrograman web", "doni", 2016);

        System.out.println("buku yang terbit setelah tahun 2015: ");

        for (Buku buku : daftarbuku) {
            if (buku.TahunTerbit > 2015) {
                System.out.println(buku.judul);
            }
        }
    }
}
