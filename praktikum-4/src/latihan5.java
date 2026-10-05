import java.util.Scanner;
public class latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        int terbesar = Integer.MIN_VALUE;
        int terbesarkedua = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (angka[i] > terbesar){
                terbesarkedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarkedua && angka[i] != terbesar) {
                terbesarkedua = angka[i];
            }
        }
        if (terbesarkedua == Integer.MIN_VALUE) {
            System.out.println("tidak adanilai terbesar kedua.");
        } else {
            System.out.println("nilai terbesar = " + terbesar);
            System.out.println("nilai terbesar kedua = " + terbesarkedua);
        }
    }

}
