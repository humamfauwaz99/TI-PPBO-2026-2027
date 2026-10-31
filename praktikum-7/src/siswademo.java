public class siswademo {
    public static void main(String[] args){
        siswa siswa = new siswa(90);

        System.out.println("nilai: " + siswa.getnilai());
        System.out.println("nilai huruf: " + siswa.getnilaihuruf());

        siswa.setnilai(60);

        System.out.println("\nsetelah diubah:");
        System.out.println("nilai: " + siswa.getnilai());
        System.out.println("nilai huruf: " + siswa.getnilaihuruf());

        siswa.setnilai(120);;
    }
}