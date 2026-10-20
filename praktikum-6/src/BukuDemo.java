public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("pemrograman java", "andi", 2020);
        Buku buku2 = new Buku("basis data", "budi", 2023);

        buku1.tampildata();

        System.out.println();

        buku2.tampildata();
    }
}
