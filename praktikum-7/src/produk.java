public class produk {
    private String kodeproduk;
    private String namaproduk;
    private double harga;
    private int stok;

    public produk(String kodeproduk, String namaproduk, double harga, int stok) {
        this.kodeproduk = kodeproduk;
        this.namaproduk = namaproduk;
        setharga(harga);
        this.stok = Math.max(stok,0);
    }
    public String getkodeproduk() {
        return kodeproduk;
    }
    public String getnamaproduk() {
        return namaproduk;
    }
    public double getharga() {
        return harga;
    }
    public int getstok() {
        return stok;
    }

    public void setharga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("harga tidak boleh negatif!");
        }
    }
    public void tambahstok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("jumlah harus positif!");
        }
    }
    public void kurangistok(int jumlah) {
        if (jumlah <= 0){
            System.out.println("jumlah harus positif!");
        } else if (jumlah > stok) {
            System.out.println("stok tidak mencukupi!");
        } else {
            stok -= jumlah;
            System.out.println("stok berhasil dikurangi.");
        }
    }
}
