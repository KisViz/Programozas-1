public class Varos {
    private String nev;
    private int nepessegSzam;
    private double terulet;

    public Varos(String nev, int nepessegSzam, double terulet) {
        this.nev = nev;
        this.nepessegSzam = nepessegSzam;
        this.terulet = terulet;
    }

    public String getNev() {
        return nev;
    }

    public int getNepessegSzam() {
        return nepessegSzam;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setNepessegSzam(int nepessegSzam) {
        this.nepessegSzam = nepessegSzam;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    // hianyzo setterek

}