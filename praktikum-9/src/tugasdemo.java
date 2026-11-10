public class tugasdemo {
    public static void main(String[] args) {
        bangundatar[] daftarbangun = {
                new lingkaran(7),
                new persegi(5),
                new persegipanjang(8,4),
                new lingkaran(10),
                new persegipanjang(12,6)
        };
        double totalluas = 0;
        double luasterbesar =0;
        String namaterbesar = "";

        System.out.println("=== DAFTAR BANGUN DATAR ===");

        for (bangundatar b : daftarbangun) {
            b.tampilkaninfo();
            double luas = b.hitungluas();
            totalluas += luas;

            if(luas > luasterbesar) {
                luasterbesar = luas;
                namaterbesar = b.namabangun;
            }
        }
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("total luas: " + totalluas);
        System.out.println("luas terbesar: " + namaterbesar);
        System.out.println("nilai luas terbesar: " + luasterbesar);
    }
}
