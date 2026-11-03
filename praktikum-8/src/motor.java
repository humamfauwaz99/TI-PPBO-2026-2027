public class motor extends  kendaraan{
    private String jenismotor;

    public motor(String merek, int kecepatanmaks, String jenismotor) {
        super(merek, kecepatanmaks);
        this.jenismotor = jenismotor;
    }
    public void tampilkaninfo() {
        System.out.println("merek: " + merek);
        System.out.println("kecepatan maksimun: " + kecepatanmaks);
        System.out.println("jenis motor: " + jenismotor);
    }
}
