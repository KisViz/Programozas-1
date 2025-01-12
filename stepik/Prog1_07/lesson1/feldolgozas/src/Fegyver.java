public class Fegyver {
    private String tipus;
    private int sebzes;
    private Tolteny[] toltenyek;

    public Fegyver(String tipus, int sebzes, Tolteny... toltenyek) {
        this.tipus = tipus;
        this.sebzes = sebzes;
        this.toltenyek = toltenyek;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getSebzes() {
        return sebzes;
    }

    public void setSebzes(int sebzes) {
        this.sebzes = sebzes;
    }

    public Tolteny[] getToltenyek() {
        return toltenyek;
    }

    public void setToltenyek(Tolteny[] toltenyek) {
        this.toltenyek = toltenyek;
    }
}
