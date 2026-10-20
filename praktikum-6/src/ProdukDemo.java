public class ProdukDemo {
    public static void main(String[] args) {
        produk produk1 = new produk("p01", "laptop", 5000000, 5 );
        produk produk2 = new produk("p02","mouse", 250000,10);

        System.out.println("produk: " + produk1.namaproduk);
        System.out.println("harga: " + produk1.harga);

        System.out.println();

        System.out.println("produk: " + produk2.namaproduk);
        System.out.println("harga: " + produk2.harga);
    }
}
