import java.util.Scanner;
public class PengolahNilaiKelas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //KKM dapat diubah sesuai kebutuhan
        int KKM = 70;
        //membaca jumlah mahasiswa
        System.out.print("masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        //membaca nilai setiap mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i]= input.nextInt();
        }
        //menghitung rata-rata,nilai tertinggi,nilai terendah,lulus dan tidak lulus
        int total =0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahlulus = 0;
        int jumlahtidaklulus = 0;
        for (int i = 0; i < n; i++ ) {
            //menghitung total nilai
            total += nilai[i];
            //mencari nilai tertinggi
            if (nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            //mencari nilai terendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            //menghitung jumlah mahasiswa lulus
            if (nilai[i] >= KKM) {
                jumlahlulus++;
            } else {
                jumlahtidaklulus++;
            }
        }
        double ratarata = (double) total / n;
        //menampilkan array sebelum diurutkan
        System.out.println("\n==========================");
        System.out.println("   LAPORAN  NILAI KELAS  ");
        System.out.println("==========================");
        System.out.print("nilai sebelum diururtkan : ");
        for (int i =0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }
        //bubble sort Ascending
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                //jika nilai kiri lebih besar, tukarkan dengan nilai kanan
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + i];
                    nilai[j + 1] = temp;
                }
            }
        }
        //menampilkan array setelah diurutkan
        System.out.print("\nNilai setelah diurutkan : ");
        for (int i = 0; i < n; i++){
            System.out.print(nilai[i] + " ");
        }
        //menampilkan hasil perhitungan
        System.out.println("\n\n-----------------------------------");
        System.out.println("rata rata kelas   : " + ratarata);
        System.out.println("nilai tertinggi   : " + tertinggi);
        System.out.println("nilai terendah    : " + terendah);
        System.out.println("KKM               : " + KKM);
        System.out.println("jumlah mahasiswa lulus : " + jumlahlulus);
        System.out.println("jumlah mahasiwa tidak lulus : " + jumlahtidaklulus);
        System.out.println("--------------------------------------");
        input.close();
    }
}
