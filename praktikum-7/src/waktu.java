public class waktu {
    private int jam;
    private int menit;
    private int detik;

    public waktu(int jam, int menit, int detik) {
        setjam(jam);
        setmenit(menit);
        setdetik(detik);
    }
    public int getJam() {
        return jam;
    }
    public int getmenit(){
        return menit;
    }
    public int getdetik(){
        return detik;
    }
    public void setjam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("jam tidak valid!");
        }
    }
    public void setmenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("menit tidak valid!");
        }
    }
    public void setdetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("detik tidak valid!");
        }
    }
}
