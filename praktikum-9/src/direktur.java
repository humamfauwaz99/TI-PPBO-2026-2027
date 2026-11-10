public class direktur extends manager {
    private double tunjangansaham;
    public direktur(String nama, String id, double gajipokok, double tunjanganjabatan, double tunjangansaham) {
        super(nama, id, gajipokok, tunjanganjabatan);
        this.tunjangansaham = tunjangansaham;
    }
    @Override
    public double hitunggaji() {
        return super.hitunggaji() + tunjangansaham;
    }
}
