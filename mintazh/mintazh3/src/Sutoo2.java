public class Sutoo2 {
    private final int maxHomerseklet;
    private final String marka;
    private boolean allapot;

    public Sutoo2(int maxHomerseklet, String marka, boolean allapot) {
        this.maxHomerseklet = maxHomerseklet;
        this.marka = marka;
        this.allapot = false;
    }

    public double elomelegitesiIdo(int hofok) {
        if (hofok > maxHomerseklet) {
            return (double) maxHomerseklet/20;
        }
        if (hofok < 0) {
            return 0;
        }
        return (double) hofok / 20;
    }

    public double sutesiIdo(double ido, int hofok) {
        return elomelegitesiIdo(hofok) + ido;
    }

    public int getMaxHomerseklet() {
        return maxHomerseklet;
    }

    public String getMarka() {
        return marka;
    }

    public boolean getAllapot() {
        return allapot;
    }

    public void setAllapot(boolean allapot) {
        this.allapot = allapot;
    }

    @Override
    public String toString() {
        return ;
    }
}
