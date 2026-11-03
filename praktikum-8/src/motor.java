public class motor extends  kendaraan{
    private String jenismotor;

    public motor(String merek, int kecepatanmaks, String jenismotor) {
        super(merek, kecepatanmaks);
        this.jenismotor = jenismotor;
    }
}
