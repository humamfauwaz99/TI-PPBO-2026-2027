public class manager extends pegawai {
    protected  double tunjanganjabatan;

    public manager(String nama, String id, double gajipokok, double tunjanganjabatan) {
        super (nama, id, gajipokok);
        this.tunjanganjabatan = tunjanganjabatan;
    }

    @Override
    public double hitunggaji() {
        return gajipokok + tunjanganjabatan;
    }
}
