public class produkdemo {
    public static void main(String[] args) {
        produk produk = new produk("p001","laptop", 5000000,10);

        System.out.println("nama: " + produk.getnamaproduk());
        System.out.println("harga: " + produk.getharga());
        System.out.println("stok: " + produk.getstok());

        produk.tambahstok(5);
        produk.kurangistok(3);
        produk.kurangistok(50);

        produk.setharga(-1000);

        System.out.println("\nStok akhir: " + produk.getstok());
        System.out.println("Harga akhir: " + produk.getharga());
    }
}
