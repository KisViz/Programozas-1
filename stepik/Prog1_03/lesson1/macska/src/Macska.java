public class Macska {
    private final String nev;
    private String szin;
    private int meret;

    public Macska(String nev, String szin, int meret) {
        this.nev = nev;
        this.szin = szin;
        this.meret = meret;
    }

    public String getNev() {
        return nev;
    }

    public String getSzin() {
        return szin;
    }

    public int getMeret() {
        return meret;
    }
}