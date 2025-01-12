public class Idopont {
    public int ora;
    public int perc;

    public Idopont(int ora, int perc) {
        this.ora = ora;
        this.perc = perc;
    }

    public Idopont(Idopont masik) {
        this.ora = masik.ora;
        this.perc = masik.perc;
    }
}
