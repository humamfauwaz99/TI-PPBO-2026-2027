public class lingkaran extends bangundatar {
    private double radius;

    public lingkaran(double radius) {
        super("lingkaran");
        this.radius = radius;
    }
    @Override
    public double hitungluas() {
        return Math.PI * radius * radius;
    }
    @Override
    public double hitungkeliling() {
        return 2 * Math.PI * radius;
    }
}
