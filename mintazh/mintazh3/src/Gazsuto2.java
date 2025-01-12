public class Gazsuto2 extends Suto2{
    private final int maximumHofok;

    public Gazsuto2(String tipus, int maximumHofok) {
        super(tipus);
        this.maximumHofok = maximumHofok;
    }

    @Override
    public boolean sut(String etelNeve, int hofok, int ido) {
        if (hofok > this.maximumHofok) {
            return false;
        }

        eteltBerak(etelNeve);

        this.setHaviFogyasztas(this.getHaviFogyasztas() + 10 + (hofok - 75)*2 + ido);

        koszossagNoveles();

        eteltKivesz();

        return true;
    }

    @Override
    public void koszossagNoveles() {
        this.setKoszossag( (this.getKoszossag() * 2 ) + 1);
    }
}
