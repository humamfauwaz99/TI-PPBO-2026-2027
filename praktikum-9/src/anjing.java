public class anjing extends hewan {
    public anjing (String nama) {
        super (nama);
    }
    @Override
    public void bersuara() {
        System.out.println(nama + ": guk guk!");
    }
}
