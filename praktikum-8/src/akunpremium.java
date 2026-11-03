public class akunpremium extends akun{
    private double bataskredit;

    public akunpremium(String username, double saldo, double bataskredit) {
        super(username, saldo);
        this.bataskredit = bataskredit;
    }
    public void ceklimit() {
        System.out.println("username: " + username);
        System.out.println("saldo: Rp" + saldo);
        System.out.println("batas kredit: RP" + bataskredit);

        System.out.println("total saldo + batas kredit: Rp" + (saldo + bataskredit));
    }
}
