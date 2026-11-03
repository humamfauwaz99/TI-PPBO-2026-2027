public class staff extends pegawai{
    private double tunjangankinerja;

    public staff (String nama, String nip, double gajipokok, double tunjangankinerja) {
        super (nama, nip, gajipokok);
        this.tunjangankinerja = tunjangankinerja;
    }
}
