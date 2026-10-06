import java.util.Scanner;
public class latihan5 {
    static int hitungtotal(int[] data ){
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }
    static int[] filterdiatasratarata(int[] data) {
        int total = hitungtotal(data);
        double ratarata = (double) total / data.length;
        int jumlah = 0;
        for (int nilai : data) {
            if (nilai > ratarata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
        int index = 0;
        for (int nilai : data) {
            if (nilai > ratarata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah nilai: ");
        int n = input.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        int total = hitungtotal(data);
        double ratarata = (double) total / data.length;
        System.out.println("total = " + total);
        System.out.println("rata-rata = " + ratarata);
        int[] hasil = filterdiatasratarata(data);
        System.out.print("nilai diatas rata-rata: ");
        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }
        input.close();
    }
}
