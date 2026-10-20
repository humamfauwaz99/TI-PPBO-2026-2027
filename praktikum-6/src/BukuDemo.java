public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("pemrograman java", "andi", 2020);
        Buku buku2 = new Buku("basis data", "budi", 2018);

        buku1.tampilkandata();

        System.out.println();

        buku2.tampilkandata();
    }
}
