public class Jarmu {
    private String tipus;
    protected int kor;
    private int megtettKm;

    public Jarmu(String tipus, int kor, int megtettKm) {
        this.tipus = tipus;
        this.kor = kor;
        this.megtettKm = megtettKm;
    }

    public Jarmu(String tipus, int kor) {
        this.tipus = tipus;
        this.kor = kor;
        this.megtettKm = 0;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMegtettKm(int megtettKm) {
        if (megtettKm < 0) {
            this.megtettKm = 0;
        }
        this.megtettKm = megtettKm;
    }

    public double kopasSzazalek() {
        double kopas = (this.kor * 2) + (double) this.megtettKm / 10000;
        return Math.min(kopas, 100.0);
    }

    public boolean selejtezniKell() {
        return (this.kopasSzazalek() > 80 && this.kor > 20);
    }

    @Override
    public String toString() {
        return "Egy "+this.tipus+" tipusu jarmu, eletkora: "+this.kor;
    }

    public String getTipus() {
        return tipus;
    }

    public int getMegtettKm() {
        return megtettKm;
    }
}
