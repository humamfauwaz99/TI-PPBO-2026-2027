public class persegipanjang extends bangundatar {
    private double panjang;
    private double lebar;

    public persegipanjang(double panjang, double lebar) {
        super("persegi panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungluas() {
        return panjang * lebar;
    }
    @Override
    public double hitungkeliling() {
        return 2 * (panjang + lebar);
    }
}
