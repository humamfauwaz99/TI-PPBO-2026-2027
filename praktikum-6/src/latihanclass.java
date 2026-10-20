public class latihanclass {
    public static void main (String[] args) {
        mahasiswa m1 = new mahasiswa(); // membuat object
        m1.nama = "humam";
        m1.nim = "2025573010036";
        m1.ipk = 3.42;

        System.out.println("nama : " + m1.nama);
        System.out.println("nim : " + m1.nim);
        System.out.println("IPK : " + m1.ipk);
    }
}
