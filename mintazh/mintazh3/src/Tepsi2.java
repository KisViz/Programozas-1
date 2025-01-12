public class Tepsi2 {
    private final int meret;
    private final int adag;

    public Tepsi2(int adag) {
        this.adag = Math.max(1, adag);
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
