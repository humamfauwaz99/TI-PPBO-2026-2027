import java.util.Scanner;
public class bilanganterbesar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("bilangan ketiga: ");
        int c = sc.nextInt();

        int terbesar;

        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= a && b >= c){
            terbesar = b;
        } else {
            terbesar = c;
        }
        System.out.println("bilangan terbesan: " + terbesar);
    }
}
