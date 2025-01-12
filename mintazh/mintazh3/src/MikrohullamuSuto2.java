public class MikrohullamuSuto2 extends Suto2{
    private final int maximalisTeljesitmeny;

    public MikrohullamuSuto2(String tipus, int maximalisTeljesitmeny) {
        super(tipus);
        this.maximalisTeljesitmeny = maximalisTeljesitmeny;
    }

    @Override
    public void koszossagNoveles() {
        this.setKoszossag(this.getKoszossag() + 1);
    }

    @Override
    public boolean sut(String etelNeve, int hofok, int ido) {
        double teljesitmeny = 3.27 * hofok - 145.45;
        if (teljesitmeny > this.maximalisTeljesitmeny) {
            return false;
        }

        eteltBerak(etelNeve);

        this.setHaviFogyasztas(getHaviFogyasztas() + (int)(teljesitmeny * ido)/60 );

        koszossagNoveles();

        eteltKivesz();

        return true;
    }


}
