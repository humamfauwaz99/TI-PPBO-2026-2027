public class lingkaran extends bangundatar {
    private double radius;

    public lingkaran(double radius) {
        this.radius = radius;
    }
    @Override
    public double hitungluas() {
        return Math.PI * radius * radius;
    }
}
