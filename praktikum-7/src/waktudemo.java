public class waktudemo {
    public static void main (String[] args) {
        waktu waktu = new waktu(10, 30, 45);

        System.out.println("waktu: " + waktu.getJam() + ":" + waktu.getmenit() + ":" + waktu.getdetik());

        waktu.setjam(25);
        waktu.setmenit(70);
        waktu.setdetik(80);

        System.out.println("waktu sekarang: " + waktu.getdetik() + ":" + waktu.getmenit() + ":" + waktu.getdetik());
    }
}
