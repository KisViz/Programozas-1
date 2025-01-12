public class ElektromosSuto extends Suto{
    private Tepsi tepsi;
    private int hatekonysag;
    private final String szin;

    public ElektromosSuto(String marka, String szin) {
        super(180, marka);
        this.tepsi = new Tepsi(4);
        this.hatekonysag = 100;
        this.szin = szin;
    }

    public double elomelegitesiIdo(int hofok) {
        int hom = Math.max(0, Math.min(this.getMaxHomerseklet(), hofok));
        return (double) (hom * 5) / this.hatekonysag;
    }

    public double sutesiIdo(double ido, int hofok) {
        return ido + elomelegitesiIdo(hofok) + tepsi.felmelegedesiIdo();
    }

    public boolean sutesiIdo() {
        this.hatekonysag -= 5;
        return this.hatekonysag > 10;
    }

    public void karbantartas() {
        this.hatekonysag = Math.min(100, this.hatekonysag *= 3);
    }

    public void tepsicsere(int adag) {
        this.tepsi = new Tepsi(adag);
    }

    public void setHatekonysag(int hatekonysag) {
        this.hatekonysag = Math.min(100, Math.max(hatekonysag, 0));
    }

    public Tepsi getTepsi() {
        return tepsi;
    }

    public int getHatekonysag() {
        return hatekonysag;
    }

    public String getSzin() {
        return szin;
    }
}
