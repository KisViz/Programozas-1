public abstract class Butor {
    private int gyartasiEv;
    private double szelesseg;
    private double magassag;
    private double melyseg;

    public Butor(int gyartasiEv, double szelesseg, double magassag, double melyseg) {
        this.gyartasiEv = gyartasiEv;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        this.melyseg = melyseg;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    public double getMagassag() {
        return magassag;
    }

    public double getMelyseg() {
        return melyseg;
    }

    public abstract String tonkremegy();

}