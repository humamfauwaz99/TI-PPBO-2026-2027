public class logikademo {
    public static void main (String [] args) {
        Boolean punyaktp = false;
        Boolean punyasim = true;

        if (punyaktp || punyasim) {
            System.out.println("boleh menyewa kendaraan");
        }
        if (!punyaktp) {
            System.out.println("ktp belum tersedia");
        }
    }
}
