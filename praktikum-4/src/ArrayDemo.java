public class ArrayDemo {
    public static void main (String[] args){
        int [] nilai = {80,75,90,60,88};
        String[] namahari = new String[3];
        namahari[0] = "senin";
        namahari[1] = "selasa";
        namahari[2] = "rabu";

        System.out.println("elemen pertama nilai: " + nilai[0]);
        System.out.println("jumlah elemen nilai: " + nilai.length);
        System.out.println("hari kedua: " + namahari[1]);

        System.out.println("---meggunakan for biasa---");
        for (int i = 0; i < nilai.length; i++){
            System.out.println("indeks " + i + ": " + nilai[i]);
        }
        System.out.println("---menggunakan enhanced for---");
        for (int n : nilai){
            System.out.println(n);
        }
    }
}
