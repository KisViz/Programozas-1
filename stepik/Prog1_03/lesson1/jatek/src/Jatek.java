public class Jatek {
    private String cim;
    private double hossz;
    private boolean idegesito;

    public Jatek(String cim, double hossz, boolean idegesito) {
        this.cim = cim;
        this.hossz = hossz;
        this.idegesito = idegesito;
    }

    public String getCim() {
        return cim;
    }

    public double getHossz() {
        return hossz;
    }

    public boolean isIdegesito() {
        return idegesito;
    }

    // hozd letre a gettereket
}