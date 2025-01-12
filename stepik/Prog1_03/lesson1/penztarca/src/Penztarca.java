public class Penztarca {
    private String szin;
    private String anyag;
    private double meret;
    private int penzmennyiseg;

    public Penztarca(String szin, String anyag, double meret, int penzmennyiseg) {
        this.szin = szin;
        this.anyag = anyag;
        this.meret = meret;
        this.penzmennyiseg = penzmennyiseg;
    }

    @Override
    public String toString() {
        return "A penztarca " + szin + " szinu, " + anyag + " anyagu. A merete: " + meret + ", a benne levo penzmennyiseg: " + penzmennyiseg + ".";
    }

    // toString megvalositas
}
