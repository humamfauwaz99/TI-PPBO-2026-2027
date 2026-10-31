public class latihan2 {
    public static void main (String[] args ){
        Buku buku = new Buku("pemrograman java", "budi", 2024);
        System.out.println("judul buku: " + buku.getJudul());
        System.out.println("pengarang: " + buku.getpengarang());
        System.out.println(" tahun terbit: " + buku.getTahunterbit());

        buku.setJudul("belajar java");
        buku.setPengarang("andi");

        System.out.println("\nSetelah diubah: ");
        System.out.println("judul buku: " + buku.getJudul());
        System.out.println("pengarang: " + buku.getpengarang());
        System.out.println("tahun terbit: " + buku.getTahunterbit());
    }
}
