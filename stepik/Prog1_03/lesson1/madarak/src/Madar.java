public class Madar {
  private String nev;
  private int repulesiSebesseg;
  private int meret;

    public Madar(String nev, int repulesiSebesseg, int meret) {
        this.nev = nev;
        this.repulesiSebesseg = repulesiSebesseg;
        this.meret = meret;
    }

    public static boolean megtalalhato(Madar[] madarak, String nev) {
        for (int i = 0; i < madarak.length; i++) {
            if (madarak[i].nev.equals(nev)) {
                return true;
            }
        }

        return false;
    }

    public static Madar leggyorsabb(Madar[] madarak) {
        if (madarak.length == 0) {
            return null;
        }

        Madar leggyorsabb = madarak[0];
        for (Madar madar: madarak) {
            if (madar.repulesiSebesseg > leggyorsabb.repulesiSebesseg) {
                leggyorsabb = madar;
            }
        }

        return leggyorsabb;
    }

    public static int kicsik(Madar[] madarak, int kuszobertek) {
        int darab = 0;
        for (Madar madar: madarak) {
            if (madar.meret < kuszobertek) {
                darab++;
            }
        }

        return darab;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getRepulesiSebesseg() {
        return repulesiSebesseg;
    }

    public void setRepulesiSebesseg(int repulesiSebesseg) {
        this.repulesiSebesseg = repulesiSebesseg;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    @Override
    public String toString() {
        return "Madar{" +
                "nev='" + nev + '\'' +
                ", repulesiSebesseg=" + repulesiSebesseg +
                ", meret=" + meret +
                '}';
    }

}