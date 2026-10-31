public class siswa {
    private double nilai;
     public siswa (double nilai) {
         setnilai(nilai);
     }
     public double getnilai(){
         return nilai;
     }
     public void setnilai(double nilai) {
         if (nilai >= 0 && nilai <= 100) {
             this.nilai = nilai;
         } else {
             System.out.println("nilai tidak valid!");
         }
     }
     public String getnilaihuruf() {
         if (nilai >= 85) {
             return "A";
         } else if (nilai >= 75) {
             return "B";
         } else if (nilai >= 65) {
             return "C";
         } else if (nilai >= 50) {
             return "D";
         } else {
             return "E";
         }
     }
}
