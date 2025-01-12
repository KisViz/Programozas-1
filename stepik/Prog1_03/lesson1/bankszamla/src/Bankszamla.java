public class Bankszamla {
    private String tulajdonos;
    private int osszeg;

    public Bankszamla(String tulaj) {
        this.tulajdonos = tulaj;
        this.osszeg = 1000;
    }

    public boolean jovairas(int ft){
        this.osszeg += ft;
        return true;
    }

    public boolean koltes(int ft) {
        if (this.osszeg >= ft){
            this.osszeg -= ft;
            return true;
        }
        return false;
    }
}