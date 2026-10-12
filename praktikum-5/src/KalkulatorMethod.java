import java.util.Scanner;
public class KalkulatorMethod {
    //method penjumlahan 2 angka
    static double tambah (double a, double b) {
        return a + b;
    }
    //method overloading penjumlahan 3 angka
    static double tambah (double a, double b, double c) {
        return a + b + c;
    }
    //method pengurangan
    static double kurang (double a, double b) {
        return a - b;
    }
    //method perkalian
    static double kali ( double a, double b) {
        return a * b;
    }
    // methode pembagian
    static double bagi (double a, double b) {
        return a / b;
    }
    // method perpangkatan
    static double pangkat ( double a, double b) {
        return Math.pow(a, b);
    }
    //method akar kuadrat
    static double akarkuadrat (double a) {
        return Math.sqrt(a);
    }
    //mencari hasil terbesar dalam riwayat
    static double riwayatkemaksimum (double[] riwayathasil ) {
        double maksimum = riwayathasil[0];
        for (int i = 1; i < riwayathasil.length; i++) {
            if (riwayathasil[i] > maksimum) {
                maksimum = riwayathasil[i];
            }
        }
        return maksimum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //menyimpan hasil perhitungan
        double[] riwayathasil = new double[1000];
        int jumlahhasil = 0;
        int pilihan;
        do {
            System.out.println("\n==== kalkulator method ====");
            System.out.println("1. tambah 2 angka");
            System.out.println("2. tambah 3 angka");
            System.out.println("3. kurang");
            System.out.println("4. kali");
            System.out.println("5. bagi");
            System.out.println("6. pangkat");
            System.out.println("7. akar kuadrat");
            System.out.println("0. keluar");
            pilihan = input.nextInt();
            double a, b, hasil = 0;
            boolean berhasil = true;
            switch (pilihan) {
                case 1:
                    System.out.print("masukkan angka oertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = tambah(a, b);
                    break;
                case 2:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua:" );
                    b = input.nextDouble();
                    System.out.print("masukkan angka ketiga: ");
                    double c = input.nextDouble();
                    hasil = tambah(a, b, c);
                    break;
                case 3:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = kurang(a, b);
                    break;
                case 4:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = kali(a, b);
                    break;
                case 5:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    if (b == 0) {
                        System.out.println("error: tidak bisa dibagi nol.");
                        berhasil = false;
                    }else {
                        hasil = bagi(a, b);
                    }
                    break;
                case 6:
                    System.out.print("masukkan bilangan: ");
                    a = input.nextDouble();
                    System.out.print("masukkan pangkat: ");
                    b = input.nextDouble();
                    hasil = pangkat(a, b);
                    break;
                case 7:
                    System.out.print("masukkan bilangan: ");
                    a = input.nextDouble();
                    if (a < 0) {
                        System.out.println("error: bilangan tidak boleh negatif.");
                        berhasil = false;
                    } else {
                        hasil = akarkuadrat(a);
                    }
                    break;
                case 0:
                    System.out.println("\nProgram selesai.");
                    if (jumlahhasil > 0) {
                        //menyalin hanya bagian array yang terisi
                        double[] datariwayat = new double[jumlahhasil];
                        for (int i = 0; i < jumlahhasil; i++) {
                            datariwayat[i] = riwayathasil[i];
                        }
                        System.out.println("hasil terbesar yang pernah dihitung: " + riwayatkemaksimum(datariwayat));
                    } else {
                        System.out.println("belum ada hasil perhitungan.");
                    }
                    break;
                default:
                    System.out.println("pilihan tidak tersedia.");
                    berhasil = false;
            }
            // menampilkan dan menyimpan hasil yang valid
            if (pilihan >= 1 && pilihan <= 7 && berhasil) {
                System.out.println("hasil = " + hasil);
                if (jumlahhasil < riwayathasil.length) {
                    riwayathasil[jumlahhasil] = hasil;
                    jumlahhasil++;
                } else {
                    System.out.println("kapasitas riwayat sudah penuh.");
                }
            }
        } while (pilihan !=0);
        input.close();
    }
}
