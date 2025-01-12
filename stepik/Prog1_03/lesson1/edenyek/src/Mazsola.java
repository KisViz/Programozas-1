public class Mazsola {
    private String szin;
    private double meret;
    private int szepseg;

    public Mazsola(String szin, double meret, int szepseg) {
        this.szin = szin;
        this.meret = meret;
        this.szepseg = szepseg;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public double getMeret() {
        return meret;
    }

    public void setMeret(double meret) {
        this.meret = meret;
    }

    public int getSzepseg() {
        return szepseg;
    }

    public void setSzepseg(int szepseg) {
        this.szepseg = szepseg;
    }

}
