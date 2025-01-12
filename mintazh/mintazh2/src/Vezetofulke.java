public class Vezetofulke {
    private String felszereltseg;
    private final double meret;
    private double allapot;

    public Vezetofulke(String felszereltseg, double meret) {
        this.felszereltseg = felszereltseg;
        this.meret = meret;
        this.allapot = 100.0;
    }

    public String getFelszereltseg() {
        return felszereltseg;
    }

    public double getMeret() {
        return meret;
    }

    public double getAllapot() {
        return allapot;
    }

    public void setFelszereltseg(String felszereltseg) {
        this.felszereltseg = felszereltseg;
    }

    public void setAllapot(double allapot) {
        if (allapot > this.allapot) {
            return;
        } else if (allapot < 0) {
            this.allapot = 0;
        }
        this.allapot = allapot;
    }
}
