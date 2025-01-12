public class MogyoroBokor extends Bokor {
    protected int termesSzam;

    public MogyoroBokor(int meret, int termesSzam) {
        super(meret);
        this.termesSzam = termesSzam;
    }

    public int getTermesSzam() {
        return termesSzam;
    }
}