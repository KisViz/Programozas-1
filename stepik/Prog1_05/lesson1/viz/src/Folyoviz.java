public abstract class Folyoviz extends Viz {
    protected int folyasiSebesseg;

    public Folyoviz(boolean tiszta, int meret, int folyasiSebesseg) {
        super(tiszta, meret);
        this.folyasiSebesseg = folyasiSebesseg;
    }

    public int sodrasiErosseg() {
        return this.meret * this.folyasiSebesseg;
    }
}
