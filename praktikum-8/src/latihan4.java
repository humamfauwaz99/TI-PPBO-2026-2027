public class latihan4 {
    public static void main(String[] args) {
        mobil mobil = new mobil ("toyota", 180,4);
        motor motor = new motor ("honda",120, "matic");

        System.out.println("=== DATA MOBIL ===");
        mobil.tampilkaninfo();

        System.out.println("=== DATA MOTOR ===");
        motor.tampilkaninfo();
    }
}
