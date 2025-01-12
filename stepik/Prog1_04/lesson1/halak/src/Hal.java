import java.util.Objects;

public class Hal {
    private String fajta;
    private String szin;
    private double meret;
    private int kor;

    public Hal(String fajta, String szin, double meret, int kor) {
        this.fajta = fajta;
        this.szin = szin;
        this.meret = meret;
        this.kor = kor;
    }

    public String getFajta() {
        return fajta;
    }

    public String getSzin() {
        return szin;
    }

    public double getMeret() {
        return meret;
    }

    public int getKor() {
        return kor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hal hal = (Hal) o;
        return Double.compare(hal.meret, meret) == 0 && kor == hal.kor && Objects.equals(fajta, hal.fajta) && Objects.equals(szin, hal.szin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fajta, szin, meret, kor);
    }
}