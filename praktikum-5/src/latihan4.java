import java.util.Scanner;
public class latihan4 {
    static int carinilaiminimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }
    static int carinilaimaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah nilai: ");
        int n = input.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        System.out.println("nilai minimum = " + carinilaiminimum(data));
        System.out.println("nilai maksimum = " + carinilaimaksimum(data));
        input.close();
    }
}
