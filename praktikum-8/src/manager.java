public class manager extends pegawai{
    private double tunjanganjabatan;

    public manager (String nama, String nip, double gajipokok, double tunjanganjabatan) {
        super(nama, nip, gajipokok);
        System.out.println("2.constructor manager dijalankan");
        this.tunjanganjabatan = tunjanganjabatan;
    }
    public void tampilkanrigkasan() {
        System.out.println("manager: " + nama);
    }

}
