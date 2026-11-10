public class bebek extends hewan {
    public bebek (String nama) {
        super(nama);
    }
    @Override
    public void bersuara(){
        System.out.println(nama + ": kwek kwek!");
    }
}
