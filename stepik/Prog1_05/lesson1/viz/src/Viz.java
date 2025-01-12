public abstract class Viz {
    protected boolean tiszta;
    protected int meret;

    public Viz(boolean tiszta, int meret) {
        this.tiszta = tiszta;
        this.meret = meret;
    }

    public abstract int sodrasiErosseg();
}