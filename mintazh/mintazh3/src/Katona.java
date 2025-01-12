
/**
 * Egy Katonat reprezentalo absztrakt osztaly
 * <p>
 * Nem peldanyosithato
 */
public abstract class Katona {
    /**
     * A katona neve
     */
    private final String nev;

    /**
     * A katona elelem mennyisege
     */
    private int elelem = 0;

    /**
     * A katona ereje
     */
    private double ero;

    /**
     * A katona fegyverereje
     */
    private double fegyverModosito = 0.0;

    public Katona(String nev, double ero) {
        this.nev = nev;
        this.ero = ero;
    }

    /**
     * Noveli az etel mennyiseget
     * 
     * @param mennyit a novekedes mennyisege
     * 
     * @return void
     */
    public void eteltRekviral(double mennyit) {
        this.elelem += mennyit;
    }

    /**
     * Noveli a katona fegyvermodoitojat
     * 
     * @return void
     */
    public void fegyvertElez() {
        this.fegyverModosito += 10.0;
    }

    /**
     * Kiszamolja a katona tamadasat
     * 
     * @return double a tamadas erteke
     */
    public abstract double tamadas();

    /**
     * Megeteti a katonat
     * 
     * @return boolean sikeres-e az etetes
     */
    public abstract boolean eszik();

    public String getNev() {
        return nev;
    }

    public int getElelem() {
        return elelem;
    }

    public void setElelem(int elelem) {
        this.elelem = elelem;
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public double getFegyverModosito() {
        return fegyverModosito;
    }

    public void setFegyverModosito(double fegyverModosito) {
        this.fegyverModosito = fegyverModosito;
    }
}