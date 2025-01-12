public class Pikas extends Katona{
    private final boolean zaszlohordozo;

    public Pikas(String nev, double ero, boolean zaszlohordozo) {
        super(nev, ero);
        this.zaszlohordozo = zaszlohordozo;
    }

    @Override
    public double tamadas() {
        if (this.zaszlohordozo) {
            return 0;
        }

        if (getElelem() < 1) {
            return -1;
        }

        return (getEro() * 1.5 + getFegyverModosito() * 2);
    }

    @Override
    public boolean eszik() {
        if (getElelem() < 2) {
            eteltRekviral(getElelem() * 2);
            fegyvertElez();
            return false;
        }

        this.setEro(getEro() + 10);
        this.setElelem(getElelem() - 2);
        return true;
    }
}
