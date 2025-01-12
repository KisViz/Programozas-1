public abstract class Zenesz {
    private String nev;
    private int kepesseg;

    public Zenesz(String nev, int kepesseg) {
        this.nev = nev;
        this.kepesseg = kepesseg;
    }

    public abstract void zenel(int meddig);

    public String getNev() {
        return nev;
    }

    public int getKepesseg() {
        return kepesseg;
    }
}