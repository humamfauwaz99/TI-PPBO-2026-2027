public class mahasiswa  {
    private String nama;
    private String nim;
    private double ipk;

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
    public String getNama() {
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public double getIpk(){
        return ipk;
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
