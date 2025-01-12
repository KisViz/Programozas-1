public class Teto2 {
    private final String szin;
    private boolean zart;

    public Teto2(String szin) {
        this.szin = szin;
        this.zart = false;
    }

    public String getSzin() {
        return szin;
    }

    public boolean isZart() {
        return zart;
    }

    public void lezar() {
        this.zart = true;
    }

    public void kinyit() {
        this.zart = false;
    }
}
