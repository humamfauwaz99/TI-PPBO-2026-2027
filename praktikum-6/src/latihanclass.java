public class latihanclass {
    public static void main (String[] args) {
        mahasiswa m1 = new mahasiswa(); // membuat object
        m1.nama = "humam";
        m1.nim = "2025573010036";
        m1.ipk = 3.42;

        mahasiswa m2 = new mahasiswa();
        m2.nama = "budi";
        m2.nim = "12345";
        m2.ipk = 3.50;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);

    }
}
