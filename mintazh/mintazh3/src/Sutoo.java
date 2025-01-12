public class Suto {
    private final int maxHomerseklet;
    private final String marka;
    private boolean allapot;

    public Suto(int maxHomerseklet, String marka) {
        this.maxHomerseklet = maxHomerseklet;
        this.marka = marka;
        this.allapot = false;
    }

    public double elomelegitesiIdo (int hofok) {
        if (hofok> this.maxHomerseklet) {
            hofok = this.maxHomerseklet;
        } else if (hofok < 0) {
            hofok = 0;
        }

//        hofok = Math.min(Math.max(0,hofok), this.maxHomerseklet);
        return (double) hofok/20;
    }
    public double sutesiIdo (double ido, int hofok) {
        return ido + elomelegitesiIdo(hofok);
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
}
