import java.util.Scanner;

public class OperasiBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //meminta dua bilangan bulat
        System.out.print("masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("masukkan bilangan kedua: ");
        int b = input.nextInt();

        //Operator aritmatika
        System.out.println("\n=== HASIL ARITMATIKA ===");
        System.out.println("Penjumlahan : " + (a + b));
        System.out.println("Pengurangan : " + (a - b));
        System.out.println("Perkalian   : " + (a * b));
        System.out.println("Pembagian   : " + (a / b));
        System.out.println("Modulus     : " + (a % b));

        //Operator perbandingan
        System.out.println("\n=== HASIL PERBANDINGAN ===");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " = " + (a == b));

        input.close();
    }
}
