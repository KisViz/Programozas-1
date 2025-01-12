public class Lovag2 extends Katona2{
    private String lo;

    public Lovag2(String nev, double ero) {
        super(nev, ero);
    }

    public Lovag2(String nev, double ero, String lo) {
        super(nev, ero);
        this.lo = lo;
    }
    @Override
    public double tamadas() {
        if (this.getElelem() < 2) {
            return -1;
        }
        return ( (getEro() * 2) + (getFegyverModosito() * 2) + (this.lo == null ? 0 : 25) );
    }

    @Override
    public boolean eszik() {
        if (this.lo != null) {
            if (this.getElelem() < 5) {
                eteltRekviral(getElelem() * 8);
                fegyvertElez();
                return false;
            } else {
                this.setElelem(getElelem() - 5);
                this.setEro(getEro() + 20);
                return true;
            }
        } else {
            if (this.getElelem() < 3) {
                eteltRekviral(this.getElelem() * 4);
                fegyvertElez();
                return false;
            } else {
                this.setEro(getEro() + 15);
                this.setElelem(getElelem() - 3);
                return true;
            }
        }
    }
}
