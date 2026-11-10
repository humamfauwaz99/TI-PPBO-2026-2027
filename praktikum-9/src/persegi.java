public class persegi extends bangundatar {
    private double sisi;
    public persegi(double sisi) {
        super("persegi");
        this.sisi = sisi;
    }
    @Override
    public double hitungluas() {
        return sisi * sisi;
    }
    @Override
    public double hitungkeliling() {
        return 4 * sisi;
    }
}
