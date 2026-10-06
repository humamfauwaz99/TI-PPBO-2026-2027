public class latihan1 {
    static double luaspersegipanjang(double p, double l) {
        return p * l;
    }
    static double luaslingkaran(double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        double luas1 = luaspersegipanjang(10,5);
        double luas2 = luaslingkaran(7);
        System.out.println("luas persegi panjang = " + luas1);
        System.out.println("luas lingkaran = " + luas2);
    }
}
