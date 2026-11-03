public class mobil extends kendaraan {
    private int jumlahpintu;

    public mobil(String merek, int kecepatanmaks, int jumlahpintu) {
        super(merek, kecepatanmaks);
        this.jumlahpintu = jumlahpintu;
    }
    public void tampilkaninfo() {
        System.out.println("merek: " + merek);
        System.out.println("kecepatan maksimum; " + kecepatanmaks);
        System.out.println("jumlah pintu: " + jumlahpintu);
    }
}
