public class latihan2 {
    public static void main(String[] args) {
        mobil mobil = new mobil("Toyota", 180, 4);
        mobil.merek = "toyota";
        mobil.kecepatanmaks = 180;

        motor motor = new motor("honda",120, "matic");
        motor.merek = "honda";
        motor.kecepatanmaks = 120;

        System.out.println("=== DATA MOBIL ===");
        System.out.println("merek: " + mobil.merek);
        System.out.println("kecepatan maksimum: " + mobil.kecepatanmaks);

        System.out.println("\n=== DATA MOTOR ===");
        System.out.println("merek: " + motor.merek);
        System.out.println("kecepatan maksimum: " + motor.kecepatanmaks);
    }
}
