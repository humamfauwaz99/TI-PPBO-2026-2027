public class BankDemo {
    public static void main(String[] args ) {
        RekeningBank rek1 = new RekeningBank("001", "budi","tabungan",100000);

        RekeningBank rek2 = new RekeningBank("002", "andi", "giro",200000);

        System.out.println("=== TRANSAKSI REKENING BUDI ===");

        rek1.setor(50000);
        rek1.tarik(20000);

        System.out.println("=== TRANSAKSI REKENING ANDI ===");

        rek2.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n=== TRANSFER ANTAR REKENING ===");

        rek1.transferke(rek2,30000);
        rek1.transferke(rek2,50000);

        System.out.println("\n=== MUTASI AKHIR ===");
        rek1.cekmutasi();
        rek2.cekmutasi();
    }
}
