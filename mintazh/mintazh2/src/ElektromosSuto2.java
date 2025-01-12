public class ElektromosSuto2 extends Suto2 {

    private Tepsi2 tepsi;
    private int felmelegedesiIdo;

    private int hatekonysag;
    private final String szin;



    public ElektromosSuto2(String marka, String szin) {
        super(180, marka);
        this.szin = szin;
        this.hatekonysag = 100;
        this.tepsi = new Tepsi2(4);
    }

    @Override
    public double elomelegitesiIdo(int hofok) {
        hofok = Math.min(Math.max(0,hofok), this.getMaxHomerseklet());
        return (double) (hofok * 5) / this.hatekonysag;
    }

    @Override
    public double sutesiIdo(double ido, int hofok) {
        return ido + elomelegitesiIdo(hofok) + this.tepsi.felmelegedesiIdo();
    }

    public boolean sut () {
        this.hatekonysag -= 5;
        return this.hatekonysag > 10;
    }

    public void karbantartas () {
        this.hatekonysag = Math.min(this.hatekonysag *= 3, 100);
    }

    public void tepsicsere (int adag) {
        this.tepsi = new Tepsi2(adag);
    }

    public void setHatekonysag(int hatekonysag) {
        this.hatekonysag =  Math.min(Math.max(hatekonysag,0), 100);
    }

    public Tepsi2 getTepsi() {
        return tepsi;
    }

    public int getFelmelegedesiIdo() {
        return felmelegedesiIdo;
    }

    public int getHatekonysag() {
        return hatekonysag;
    }

    public String getSzin() {
        return szin;
    }
}
