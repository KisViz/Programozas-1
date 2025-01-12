public class Allat {
    private String alfaj;
    private int meret;

    public Allat(String alfaj, int meret) {
        this.alfaj = alfaj;
        this.meret = meret;
    }

    @Override
    public String toString() {
        return alfaj + " " + meret;
    }
}