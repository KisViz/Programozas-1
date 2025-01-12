public class Gazsuto extends Suto {
    private final int maximumHofok;

    public Gazsuto(String tipus, int maximumHofok) {
        super(tipus);
        this.maximumHofok = maximumHofok;
    }

    @Override
    public boolean sut(String etelNeve, int hofok, int ido) {
        if (this.maximumHofok < hofok) {
            return false;
        }

        eteltBerak(etelNeve);

        int ujhofok = hofok - 75;
        this.setHaviFogyasztas(this.getHaviFogyasztas() + (10 + (ujhofok * 2) + ido));

        koszossagNoveles();

        eteltKivesz();

        return true;
    }

    @Override
    public void koszossagNoveles() {
        this.setKoszossag( (this.getKoszossag() * 2) + 1 );
    }
}
