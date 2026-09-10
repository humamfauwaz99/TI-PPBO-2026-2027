import java.util.Scanner;
public class Kalkulator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //t panjang dan lebar persegi panjang
        System.out.print("masukkan panjang: ");
        Double panjang = input.nextDouble();

        System.out.print("masukkan lebar: ");
        double lebar = input.nextDouble();

        // menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingpersegipanjang = 2 * (panjang + lebar);

        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Luas       : " + luasPersegiPanjang);
        System.out.println("Keliling   : " + kelilingpersegipanjang);

        //mengecek apakah luas lebih besar dari 100
        boolean LuasBesar = luasPersegiPanjang > 100;
        System.out.println("luas > 100: " + LuasBesar);

        // input jari jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        //menghitung luas dan keliling lingkaran
        double luaslingkaran = Math.PI * jarijari * jarijari;
        double kelilinglingkaran = 2 * Math.PI * jarijari;

        System.out.println("\n=== lingkarang ===");
        System.out.println("Luas     : " + luaslingkaran);
        System.out.println("Keliling : " + kelilinglingkaran);

        input.close();
    }
}
