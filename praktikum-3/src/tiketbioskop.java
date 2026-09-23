import java.util.Scanner;
public class tiketbioskop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan umur: ");
        int umur = sc.nextInt();
        System.out.print("mahasiswa? (true/false): ");
        Boolean mahasiswa = sc.nextBoolean();

        int harga;

        if (mahasiswa && umur > 25) {
            harga = 25000;
        } else {
            harga = 40000;
        }
        System.out.println("harga tiket: rp" + harga);
    }
}
