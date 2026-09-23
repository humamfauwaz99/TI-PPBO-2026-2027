import java.util.Scanner;
public class klasifikasiBMI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("berat badan(kg): ");
        double berat = sc.nextDouble();
        System.out.print("tinggi badan (m): ");
        double tinggi = sc.nextDouble();
        double bmi = berat / (tinggi * tinggi);
        System.out.print("BMI: " + bmi);

        if (bmi < 18.5){
            System.out.println("kurus");
        } else if (bmi < 25){
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("gemuk");
        } else {
            System.out.println("obesitas");
        }
    }
}
