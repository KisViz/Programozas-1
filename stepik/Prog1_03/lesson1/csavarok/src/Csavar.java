public class Csavar {
    private String anyag;
    private double hossz;
    private double vastagsag;
    private int erosseg;
    private int ar;

    // konstruktorok

    public Csavar() {
        this.anyag = "fa";
        this.hossz = 50;
        this.vastagsag = 3.5;
        this.erosseg = 7;
        this.ar = 100000;
    }

    public Csavar(String anyag, double hossz, double vastagsag, int erosseg, int ar) {
        this.anyag = anyag;
        this.hossz = hossz;
        this.vastagsag = vastagsag;

        if (erosseg < 0){
            this.erosseg = 1;
        } else {
            this.erosseg = erosseg;
        }

        if (ar < 1000){
            this.ar = 1000;
        } else {
            this.ar = ar;
        }
    }

    public Csavar(String anyag, double hossz, double vastagsag, int erosseg) {
        this.ar = 5313;
        this.anyag = anyag;
        this.hossz = hossz;
        this.vastagsag = vastagsag;

        if (erosseg < 5) {
            this.erosseg = 5;
        } else {
            this.erosseg = erosseg;
        }
    }

    public String getAnyag() {
        return anyag;
    }

    public double getHossz() {
        return hossz;
    }

    public double getVastagsag() {
        return vastagsag;
    }

    public int getErosseg() {
        return erosseg;
    }

    public int getAr() {
        return ar;
    }
}