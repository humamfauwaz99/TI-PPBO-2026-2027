public class mahasiswa  {
    String nama;
    String nim;
    double ipk;

    public mahasiswa () {
        nama = "belum diisi" ;
        nim = "-";
        ipk = 0.0;
    }

    public mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
     public void tampilkandata() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("ipk : " + ipk);
     }

     public boolean iscumloade() {
        return ipk >= 3.5;
     }
}
