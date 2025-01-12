public class Kor {
    private int atmero;

    public Kor(int atmero) {
        setAtmero(atmero);
    }

    public void setAtmero(int atmero) {
        if (atmero > 0) {
            this.atmero = atmero;
        } else {
            this.atmero = 1;
        }


/*        if (atmero < 1) {
            this.atmero = 1;
        }
        this.atmero = atmero;*/
    }

    public int getAtmero() {
        return atmero;
    }

    // megoldas
}
