public class Lampa {
    private boolean vilagit;

    public Lampa(boolean vilagit) {
        this.vilagit = vilagit;
    }

    public boolean isVilagit() {
        return vilagit;
    }

    public void setVilagit(boolean vilagit) {
        this.vilagit = vilagit;
    }

    @Override
    public String toString() {
        return vilagit ? "vilagos van" : "sotet van";
    }


}