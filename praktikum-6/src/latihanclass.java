public class latihanclass {
    public static void main (String[] args) {
        mahasiswa m1 = new mahasiswa(); // membuat object

        mahasiswa m2 = new mahasiswa(" budi ", "12345", 3.50);

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);

    }
}
