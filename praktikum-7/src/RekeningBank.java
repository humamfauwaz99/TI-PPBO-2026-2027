public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;

    public RekeningBank(String nomor, String pemilik, double saldoawal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoawal >= 0) ? saldoawal : 0;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
    public String getPemilik() {
        return pemilik;
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
            System.out.println("tarik berhasil. saldo: " + saldo);
        }
    }
}
