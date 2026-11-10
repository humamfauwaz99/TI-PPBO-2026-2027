public class kebunbinatangdemo {
    public static void main(String[] args ) {
        hewan[] daftarhewan = {
                new kucing("milo"),
                new anjing("rex"),
                new kucing("oyen"),
        };
        for (hewan h : daftarhewan) {
            h.bersuara();
        }
    }
}
