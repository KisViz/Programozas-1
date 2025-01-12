public class Suto {
    private final int maxHomerseklet;
    private final String marka;
    private boolean allapot;

    public Suto(int maxHomerseklet, String marka) {
        this.maxHomerseklet = maxHomerseklet;
        this.marka = marka;
        this.allapot = false;
    }

    public double elomelegitesiIdo(int hofok) {
        double hom = Math.max(0, Math.min(maxHomerseklet, (double) hofok));
        return hom/20;
    }

    public double sutesiIdo(double ido, int hofok) {
        return ido + elomelegitesiIdo(hofok);
    }

    public int getMaxHomerseklet() {
        return maxHomerseklet;
    }

    public String getMarka() {
        return marka;
    }

    public boolean isAllapot() {
        return allapot;
    }

    public void setAllapot(boolean allapot) {
        this.allapot = allapot;
    }
}
