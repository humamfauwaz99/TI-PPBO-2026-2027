public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisrekening;
    private double saldo;

    public RekeningBank(String nomor, String pemilik,String jenisrekening, double saldoawal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisrekening = jenisrekening;
        this.saldo = (saldoawal >= 0) ? saldoawal : 0;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
    public String getPemilik() {
        return pemilik;
    }
    public String getJenisrekening() {
        return jenisrekening;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("stero berhasil. saldo: " + saldo);
    }
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("tarik berhasil." + jumlah);
        }
    }
    public void transferke(RekeningBank tujuan, double jumlah) {
        if (tujuan == null || tujuan == this) {
            System.out.println("rekening tujuan tidak valid!");
        } else if (jumlah <= 0) {
            System.out.println("jumlah transfer harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("transfer gagal! saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("transfer berhasil!");
            System.out.println("jumlah: " + jumlah);
            System.out.println("ke rekening: " + tujuan.nomorRekening);
        }
    }
    public void cekmutasi() {
        System.out.println("\n================================================");
        System.out.println("            LAPORAN MUTASI REKENING             ");
        System.out.println("================================================");

        System.out.println("nomor rekening: " + nomorRekening);
        System.out.println("nama pemilik: " + pemilik);
        System.out.println("jenis rekening: " + jenisrekening);
        System.out.println("saldo saat ini : Rp" + saldo);

        System.out.println("================================================");
    }
}
