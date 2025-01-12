public class Tepsi {
    private final int meret;
    private final int adag;

    public Tepsi(int adag) {
        this.adag = Math.max(1, adag);
        this.meret = adag * 10;
    }

    public double felmelegedesiIdo() {
        return (double) adag * 1.5;
    }

    public int getMeret() {
        return meret;
    }

    public int getAdag() {
        return adag;
    }
}
