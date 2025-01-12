public class Fogkefe {
    private int sortekSzama;
    protected double allapot;
    private final String szin;

    public Fogkefe(String szin, int sortekSzama) {
        this.sortekSzama = sortekSzama;
        this.szin = szin;
    }

    /**---------------------------------------------------------------------------*/

    public void setSortekSzama(int sortekSzama) {
        this.sortekSzama = Math.min(sortekSzama, this.sortekSzama);
    }

    public int getSortekSzama() {
        return sortekSzama;
    }

    public double getAllapot() {
        return allapot;
    }

    public String getSzin() {
        return szin;
    }

    /**---------------------------------------------------------------------------*/

    public boolean dizajnos() {
        return true;
    }

    public double fogmosas(int ido) {
        double hatekonysag;
        if (ido >= 3) {
            hatekonysag = 100;
        } else {
            hatekonysag = (double) ido/3 * 100;
        }

        hatekonysag *= (0.5 + 0.5*(this.allapot / 100.0)); //allapot alapjan
        hatekonysag *= this.sortekSzama/1000.0; //sortek

        this.allapot -= ido * 0.5;
        this.allapot = Math.max(0, this.allapot);

        System.out.println(hatekonysag);
        return hatekonysag;
    }

    public boolean cserelniKell() {
        return this.allapot < 20;
    }

    @Override
    public String toString() {
        return "Egy " + this.szin + " szinu fogkefe, allapota: " + allapot;
    }


}
