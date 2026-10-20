public class daftarmahasiswa {
    public static void main (String[] args) {
        mahasiswa[] daftar = new mahasiswa[3];
        daftar[0] = new mahasiswa ("budi", "111", 3.2);
        daftar[1] = new mahasiswa ("siti", "222" , 3.8);
        daftar[2] = new mahasiswa ("andi", "333" , 3.6);

        for (mahasiswa m : daftar) {
            m.tampilkandata();
            System.out.println("---");
        }
        int jumlahCumlaude = 0;
        for (mahasiswa m : daftar) {
            if (m.iscumloade()) {
                jumlahCumlaude++;
            }
        }
        System.out.println("jumlah mahasiswa cumlaude: " + jumlahCumlaude);
    }
}
