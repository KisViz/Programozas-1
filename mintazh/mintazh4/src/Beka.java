public class Beka {
    private String nev;
    private int ugrasiMagassag;

    public Beka(String nev, int ugrasiMagassag) {
        this.nev = nev;
        this.ugrasiMagassag = ugrasiMagassag;
    }

    public Beka(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Beka{" +
                "nev='" + nev + '\'' +
                ", ugrasiMagassag=" + ugrasiMagassag +
                '}';
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getUgrasiMagassag() {
        return ugrasiMagassag;
    }

    public void setUgrasiMagassag(int ugrasiMagassag) {
        this.ugrasiMagassag = ugrasiMagassag;
    }
}