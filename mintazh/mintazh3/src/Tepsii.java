public class Tepsi {
    private final int meret;
    private final int adag;

    public Tepsi(int adag) {
        this.adag = Math.max(adag,1);
        this.meret = this.adag * 10;
    }

    public double felmelegedesiIdo() {
        return this.adag * 1.5;
    }

    public int getMeret() {
        return meret;
    }

    public int getAdag() {
        return adag;
    }
}
