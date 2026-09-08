import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input suhu Celsius
        System.out.print("Masukkan suhu Celsius: ");
        double celsius = input.nextDouble();

        // Menghitung Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Menampilkan hasil
        System.out.println("Suhu Fahrenheit: " + fahrenheit);

        input.close();
    }
}
