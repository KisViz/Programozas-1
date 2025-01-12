public class Fej {
    private double allapot;
    private final String szin;

    public Fej(String szin) {
        this.szin = szin;
        this.allapot = 100.0;
    }

    public double getAllapot() {
        return allapot;
    }

    public String getSzin() {
        return szin;
    }

    public void setAllapot(double allapot) {
        if (allapot > this.allapot) {
            //marad az allapot
        } else if (allapot < 0) {
            this.allapot = 0;
        } else {
            this.allapot = allapot;
        }
    }
}
