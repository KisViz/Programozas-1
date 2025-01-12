public class Karakter {
    private String nev;
    private int szint;
    private Fegyver fegyver;
    private Lo lo;

    public Karakter(String nev, int szint, Fegyver fegyver, Lo lo) {
        this.nev = nev;
        this.szint = szint;
        this.fegyver = fegyver;
        this.lo = lo;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzint() {
        return szint;
    }

    public void setSzint(int szint) {
        this.szint = szint;
    }

    public Fegyver getFegyver() {
        return fegyver;
    }

    public void setFegyver(Fegyver fegyver) {
        this.fegyver = fegyver;
    }

    public Lo getLo() {
        return lo;
    }

    public void setLo(Lo lo) {
        this.lo = lo;
    }

}
