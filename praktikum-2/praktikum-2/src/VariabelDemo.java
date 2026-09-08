public class VariabelDemo {
    public static void main(String[] args) {
        int nilaibulat = 9;
        double nilaidouble = nilaibulat; // widening otomatis
        System.out.println("Widening: " + nilaidouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; // narrowing eksplisit
        System.out.println("Narrowing: " + hasilCasting);
    }
}
