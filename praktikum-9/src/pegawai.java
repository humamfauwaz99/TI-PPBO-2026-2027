public class pegawai {
    protected  String nama;
    protected String id;
    protected  double gajipokok;

    public pegawai(String nama, String id, double gajipokok) {
        this.nama = nama;
        this.id = id;
        this.gajipokok = gajipokok;
    }
    public double hitunggaji() {
        return gajipokok;
    }
}
