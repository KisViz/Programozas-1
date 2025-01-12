public class Telefon {
    private int toltottseg;

    public Telefon(int toltottseg) {
        this.toltottseg = toltottseg;
    }

    public int getToltottseg() {
        return toltottseg;
    }

    public void merul() {
        if (toltottseg == 0) {
            // kivetelt kell dobni
        }

        toltottseg--;
    }

}