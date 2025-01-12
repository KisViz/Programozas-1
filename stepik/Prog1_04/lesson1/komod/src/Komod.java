public class Komod extends Butor {
    private int fiokokSzama;

    public Komod(int magassag, int szelesseg, int melyseg, int fiokokSzama) {
        super(magassag,szelesseg,melyseg);
        this.fiokokSzama = fiokokSzama;
    }

    public int getFiokokSzama() {
        return fiokokSzama;
    }

}
