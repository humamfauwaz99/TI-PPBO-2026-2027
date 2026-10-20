public class produk {
    String namaproduk;
    double harga;

    public produk(String namaproduk, double harga) {
        this.namaproduk = namaproduk;
        this.harga = harga;
    }

    public boolean isMahal(double batasharga) {
        return harga > batasharga;
    }
}
