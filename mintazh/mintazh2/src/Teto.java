public class Teto {
    private final String szin;
    private boolean zart;

    public Teto(String szin){
        this.szin=szin;
        zart=false;
    }

    public String getSzin() {
        return szin;
    }

    public boolean isZart() {
        return zart;
    }

    public void lezar(){
        zart=true;
    }

    public void kinyit(){
        zart=false;
    }
}
