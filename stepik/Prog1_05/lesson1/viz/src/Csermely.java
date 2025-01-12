public class Csermely extends Folyoviz {
    public Csermely(boolean tiszta, int meret, int folyasiSebesseg) {
        super(tiszta, meret, folyasiSebesseg);
    }

    @Override
    public int sodrasiErosseg() {
        return 1;
    }
}
