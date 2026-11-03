public class pegawai {
    protected  String nama;
    protected String nip;
    protected  double gajipokok;

    public pegawai(String nama, String nip, double gajipokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajipokok = gajipokok;
    }
    public void tampilkandata() {
        System.out.println("nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("gaji pokok : " + gajipokok);
    }
}
