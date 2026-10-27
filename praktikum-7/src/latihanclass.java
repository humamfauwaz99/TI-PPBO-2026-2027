public class latihanclass {
    public static void main (String[] args) {
        mahasiswa m1 = new mahasiswa("budi ", "12345", 3.50);

        m1.setIpk(3.8);
        System.out.println("IPK sekarang: " + m1.getIpk());

        m1.setIpk(9.9);
        System.out.println("IPK sekarang: " + m1.getIpk());

    }
}
