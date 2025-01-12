public class Pikas2 extends Katona2{
    private final boolean zaszlohordozo;

    public Pikas2(String nev, double ero, boolean zaszlohordozo) {
        super(nev, ero);
        this.zaszlohordozo = zaszlohordozo;
    }

    @Override
    public double tamadas() {
        if (this.zaszlohordozo) {
            return 0;
        }

        if (this.getElelem() < 1) {
            return -1;
        }

        return ( (getEro() * 1.5) + (getFegyverModosito() * 2) );
    }

    @Override
    public boolean eszik() {
        if (getElelem() < 2) {
            eteltRekviral(this.getElelem() * 2);
            fegyvertElez();
            return false;
        } else {
            this.setEro(getEro() + 10);
            this.setElelem(getElelem() - 2);
            return true;
        }
    }
}
