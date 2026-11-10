public class arraybangundatar {
    public static void main (String[] args) {
        bangundatar[] daftar = {
                new lingkaran(7),
                new persegi(5),
                new lingkaran(10),
                new persegi(4)
        };
        double totalluas = 0;

        for (bangundatar b : daftar) {
            System.out.println("luas: " + b.hitungluas());
            totalluas += b.hitungluas();
        }
        System.out.println("total luas: " + totalluas);
    }
}
