public class ElektromosFogkefe extends Fogkefe{
    private Fej fej;
    private final boolean cserelhetoFej;

    public ElektromosFogkefe(String szin, int sortekSzama, boolean cserelhetoFej) {
        super(szin, sortekSzama);
        this.cserelhetoFej = cserelhetoFej;
    }

    /**---------------------------------------------------------------------------*/

    @Override
    public double getAllapot() {
        return (allapot + fej.getAllapot()) / 2;
    }

    /**---------------------------------------------------------------------------*/

    public void fejCsere(Fej ujFej) {
        if (!this.cserelhetoFej) {
            System.err.println("Ez nem cserelheto feju fogkefe!");
        }

        if (ujFej == this.fej) {
            System.err.println("Ugyanazt a fejet nem lehet rarakni ujra!" );
        }

        this.fej = ujFej;
    }

    @Override
    public double fogmosas(int ido) {
        double hatekonysag;
        if (ido == 1) {
            hatekonysag = 50;
        } else if (ido == 2) {
            hatekonysag = 75;
        } else {
            hatekonysag = 100;
        }

        fej.setAllapot(ido * 0.5);
        allapot -= 0.1;

        return hatekonysag;
    }



    public boolean cserelniKell() {
        return fej.getAllapot() < 10;
    }

    public boolean dizajnos() {
        return fej.getSzin().equals(getSzin());
    }


}
