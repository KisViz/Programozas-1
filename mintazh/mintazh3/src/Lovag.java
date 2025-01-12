public class Lovag extends Katona{
    private String lo;

    public Lovag(String nev, double ero) {
        super(nev, ero);
    }

    public Lovag(String nev, double ero, String lo) {
        super(nev, ero);
        this.lo = lo;
    }

    @Override
    public double tamadas() {
        if (this.getElelem() < 2) {
            return -1;
        }

        return ( (getEro() * 2) + (getFegyverModosito() * 2) + (this.lo == null ? 0 : 25));
    }

    @Override
    public boolean eszik() {
        if (this.lo != null) {
            if (getElelem() < 5) {
                eteltRekviral(this.getElelem() * 8); //?
                fegyvertElez();
                return false;
            } else {
                this.setElelem(getElelem() - 5);
                this.setEro(getEro() + 20);
                return true;
            }
        } else {
            if (getElelem() < 3) {
                eteltRekviral(getElelem() * 4); //?
                fegyvertElez();
                return false;
            } else {
                setEro(getEro() + 15);
                setElelem(getElelem() - 3);
                return true;
            }
        }
    }
}
