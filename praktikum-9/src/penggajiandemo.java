public class penggajiandemo {
    public static void main(String[] args) {
        pegawai[] daftarpegawai = {
                new manager ("budi", "m001", 3000000, 1000000),
                new staff("siti", "s001", 2000000, 500000),
                new staff("andi", "s002", 2000000, 300000),
        };
        double totalgaji = 0;
        for (pegawai pg : daftarpegawai) {
            double gaji = pg.hitunggaji();
            System.out.println(pg.nama + ": " + gaji);
            totalgaji += gaji;
        }
        System.out.println("total gaji: " + totalgaji);
    }
}
