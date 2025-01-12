public class Etel {
    private String nev;
    private double minoseg;

    public Etel(String nev, double minoseg) {
        this.nev = nev;
        this.minoseg = Math.min(1,Math.max(0, minoseg));
    }

    public String getNev() {
        return nev;
    }

    public double getMinoseg() {
        return minoseg;
    }
}