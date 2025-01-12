public class Eger extends Allat {

    private int cincogasiMertek;

    public Eger(int meret, int cincogasiMertek) {
        super("eger", meret);
        this.cincogasiMertek = cincogasiMertek;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.cincogasiMertek;
    }
}
