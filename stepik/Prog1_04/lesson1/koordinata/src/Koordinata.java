public class Koordinata {
    private double x;
    private double y;
    private double z;

    public Koordinata(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Koordinata(Koordinata uj) {
        this.x = uj.x;
        this.y = uj.y;
        this.z = uj.z;
    }
}