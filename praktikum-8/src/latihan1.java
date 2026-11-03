public class latihan1 {
    public static void main (String[] args) {
        kucing kucing = new kucing();
        kucing.nama = "budi";

        System.out.println("nama: " + kucing.nama);
        kucing.bersuara();

        anjing anjing = new anjing();
        anjing.nama = "anto";

        System.out.println("nama: " + anjing.nama);
        anjing.bersuara();
    }
}
