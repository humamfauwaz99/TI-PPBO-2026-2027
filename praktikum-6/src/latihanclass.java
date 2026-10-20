public class latihanclass {
    public static void main (String[] args) {
        mahasiswa m1 = new mahasiswa(); // membuat object

        mahasiswa m2 = new mahasiswa("budi ", "12345", 3.50);
        m2.tampilkandata();

        System.out.println("Cumlaude ? " + m2.iscumloade());

    }
}
