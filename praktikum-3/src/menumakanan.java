import java.util.Scanner;
public class menumakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pilih menu(1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("nasi goreng"); break;
            case 2:
                System.out.println("mie ayam"); break;
            case 3:
                System.out.println("nasi ayam"); break;
            case 4:
                System.out.println("bakso"); break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
