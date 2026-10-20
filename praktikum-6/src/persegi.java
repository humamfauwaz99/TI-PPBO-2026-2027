public class persegi {
    double sisi;

    public persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungluas() {
        return sisi * sisi;
    }

    public double hitungkeliling(){
        return 4 * sisi;
    }
}
