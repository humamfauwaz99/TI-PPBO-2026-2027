public class bangundatar {
    protected String namabangun;

    public bangundatar (String namabangun) {
        this.namabangun = namabangun;
    }
    public double hitungluas() {
        return 0;
    }
    public double hitungkeliling(){
        return 0;
    }
    public void tampilkaninfo() {
        System.out.println("nama bangun: " + namabangun);
        System.out.println("luas: " + hitungluas());
        System.out.println("keliling: " + hitungkeliling());
        System.out.println("------------------------");
    }

}
