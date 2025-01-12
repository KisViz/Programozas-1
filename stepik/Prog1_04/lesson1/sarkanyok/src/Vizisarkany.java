public class Vizisarkany extends Sarkany{
    private int vizkopoKepesseg;
    private double vizbenLet;

    public Vizisarkany(String nev, String szin, double ero, int vizkopoKepesseg, double vizbenLet) {
        super(nev, szin, ero, false);
        this.vizkopoKepesseg = vizkopoKepesseg;
        this.vizbenLet = vizbenLet;

        if (this.vizbenLet < 0) {
            this.vizbenLet = 0;
        }
    }

    public Vizisarkany(String nev, double ero, int vizkopoKepesseg) {
        super(nev, nev.contains("zold") ? "zold" : nev.contains("kek") ? "kek" : "voros", ero, false);
        this.vizbenLet = 1;
        this.vizkopoKepesseg = vizkopoKepesseg;
    }

    public boolean uszik(int szam) {
        return this.vizbenLet >= (double) szam / 60.0;
    }

    public double vizetKop() {
        return this.vizkopoKepesseg * this.ero;
    }

    public String toString() {
        return super.toString() + " A vizisarkany vizkopo kepessege " + (vizkopoKepesseg < 10 ? "alacsony" : "magas") + ", " + vizbenLet + " orat kepes vizben tolteni.";
    }

    public int getVizkopoKepesseg() {
        return vizkopoKepesseg;
    }

    public double getVizbenLet() {
        return vizbenLet;
    }


}