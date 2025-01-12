public class Trolibusz extends Jarmu{
    private Vezetofulke vezetofulke;
    private boolean onjaro;


    public Trolibusz(String tipus, int kor, int megtettKm, boolean onjaro) {
        super(tipus, kor, megtettKm);
        this.onjaro = this.kor < 5 ? true : onjaro;
    }

    @Override
    public String toString() {
        return super.toString() + ", onjaro: " + (onjaro ? "igen" : "nem");
    }

    public void setOnjaro(boolean onjaro) {
        this.onjaro = this.kor < 5 ? true : onjaro;
    }

    public Vezetofulke getVezetofulke() {
        return vezetofulke;
    }

    public void vezetofulkeHozzadasa(Vezetofulke fulke) {
        if (this.vezetofulke != null){
            return;
        }

        double ujallapot = fulke.getAllapot() - (this.kor - (double) this.getMegtettKm() / 10000);
        this.vezetofulke = new Vezetofulke(getTipus().equals("Solaris") ? "magas" : fulke.getFelszereltseg(), fulke.getMeret());
        this.vezetofulke.setAllapot(ujallapot);
    }

    @Override
    public double kopasSzazalek() {
        return Math.min(super.kopasSzazalek() * 5, 100);
    }

    @Override
    public boolean selejtezniKell() {
        if (this.vezetofulke.getAllapot() < 20) {
            return true;
        }
        return (this.kor > 20 && !onjaro);
    }
}
