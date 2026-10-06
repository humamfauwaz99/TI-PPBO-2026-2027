public class latihan3 {
    static double konversisuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    static double konversisuhu(double celsius, String skalatujuan) {
        if (skalatujuan.equalsIgnoreCase("kelvin")) {
            return celsius + 273.15;
        }
        else if (skalatujuan.equalsIgnoreCase("fahrenheit")){
            return (celsius * 9 / 5) + 32;
        }
        return -1;
    }
    public static void main(String[] args){
        double celsius = 30;
        System.out.println("celsius = " + celsius);
        System.out.println("fahrenheit = " + konversisuhu(celsius));
        System.out.println("kelvin = " +konversisuhu(celsius, "kelvin"));
        System.out.println("fahrenheit = " + konversisuhu(celsius, "fahrenheit"));
    }
}
