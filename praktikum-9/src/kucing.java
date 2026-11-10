public class kucing extends hewan{
    public kucing (String nama) {
        super(nama);
    }
    @Override
    public void bersuara() {
        System.out.println(nama + ": meong!");
    }
}
