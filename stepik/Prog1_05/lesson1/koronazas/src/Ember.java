public abstract class Ember {
    protected String nev;
    protected int kor;
    protected int vagyon;
    protected boolean beteg;
    protected boolean ferfi;

    public Ember(String nev, int kor, int vagyon, boolean ferfi) {
        this.nev = nev;
        this.kor = kor;
        this.vagyon = vagyon;
        this.ferfi = ferfi;
        this.beteg = false;
    }

    public abstract boolean eszik(Etel etel);
    public boolean koltekezik(int osszeg) {
        if (this.vagyon < osszeg) {
            return false;
        } else {
            this.vagyon -= osszeg;
            return true;
        }
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public int getVagyon() {
        return vagyon;
    }

    public boolean isBeteg() {
        return beteg;
    }

    public boolean isFerfi() {
        return ferfi;
    }
}