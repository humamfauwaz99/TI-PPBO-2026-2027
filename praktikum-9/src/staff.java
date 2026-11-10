public class staff extends pegawai {
    protected  double tunjangankinerja;

    public staff(String nama, String id, double gajipokok, double tunjangankinerja) {
        super(nama, id, gajipokok);
        this.tunjangankinerja = tunjangankinerja;
    }
    @Override
    public double hitunggaji() {
        return gajipokok + tunjangankinerja;
    }
}
