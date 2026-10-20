public class ProdukDemo {
    public static void main(String[] args) {
        produk produk1 = new produk("laptop", 5000000);
        produk produk2 = new produk("mouse",150000);

        System.out.println("produk: " + produk1.namaproduk);
        System.out.println("harga: " + produk1.harga);
        System.out.println("mahal? " + produk1.isMahal(1000000));

        System.out.println();

        System.out.println("produk: " + produk2.namaproduk);
        System.out.println("harga: " + produk2.harga);
        System.out.println("mahal? " + produk2.isMahal(1000000));
    }
}
