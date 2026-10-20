public class TokoDemo {
    public static void main(String[] args) {
        produk[] daftarproduk = new produk[5];

        daftarproduk[0] = new produk("p001", "laptop", 5000000,5);
        daftarproduk[1] = new produk("p002", "mouse",150000,10);
        daftarproduk[2] = new produk("p003" ,"keyboard", 250000,3);
        daftarproduk[3] = new produk("p004", "headset", 300000,6);
        daftarproduk[4] = new produk("p005", "monitor", 2000000,5);

        System.out.println("=== DAFTAR PRODUK ===");
        for (produk produk : daftarproduk) {
            produk.tampikandata();
            System.out.println("--------------------");
        }
        System.out.println("\n=== PEMBELIAN PERTAMA ===");
        int jumlahbeli1 = 2;
        System.out.println("produk: " + daftarproduk[1].namaproduk);
        System.out.println("total harga: RP" + daftarproduk[1].hitungtotalharga(jumlahbeli1));

        daftarproduk[1]. kurangistok(jumlahbeli1);

        System.out.println("\n=== PEMBELIAN KEDUA ===");
        int jumlahbeli2 = 10;
        System.out.println("produk: " + daftarproduk[2].namaproduk);
        System.out.println("total harga: RP" + daftarproduk[2].hitungtotalharga(jumlahbeli2));

        daftarproduk[2].kurangistok(jumlahbeli2);

        System.out.println("\n=== PRODUK TERMAHAL ===");

        produk termahal = daftarproduk[0];

        for (int i = 1; i < daftarproduk.length; i++) {
            if (daftarproduk[i].harga > termahal.harga) {
                termahal = daftarproduk[i];
            }
        }
        termahal.tampikandata();
    }
}
