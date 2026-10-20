public class produk {
    String kodeproduk;
    String namaproduk;
    double harga;
    int stok;

    public produk(String kodeproduk, String namaproduk, double harga, int stok) {
        this.kodeproduk = kodeproduk;
        this.namaproduk = namaproduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungtotalharga(int jumlahbeli) {
        return harga * jumlahbeli;
    }

    public void kurangistok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("pembelian berhasil.");
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    public void tampikandata() {
        System.out.println("kode produk: " + kodeproduk);
        System.out.println("nama produk: " + namaproduk);
        System.out.println("harga: RP" + harga);
        System.out.println("Stok: " + stok);
    }
}
