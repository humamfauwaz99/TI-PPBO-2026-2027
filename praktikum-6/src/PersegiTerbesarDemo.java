public class PersegiTerbesarDemo {
    public static void main(String[] args) {
        persegi[] daftarpersegi = new persegi[4];

        daftarpersegi[0] = new persegi(3);
        daftarpersegi[1] = new persegi(5);
        daftarpersegi[2] = new persegi(8);
        daftarpersegi[3] = new persegi(6);

        int indeksterbesar = 0;

        for (int i = 1; i < daftarpersegi.length; i++) {
            if (daftarpersegi[i].hitungluas() > daftarpersegi[indeksterbesar].hitungluas()) {
                indeksterbesar = i;
            }
        }
        System.out.println("persegi dengan luas terbesar: ");
        System.out.println("sisi: " + daftarpersegi[indeksterbesar].sisi);
        System.out.println("luas: " + daftarpersegi[indeksterbesar].hitungluas());
    }
}
