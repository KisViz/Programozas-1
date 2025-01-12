public class OkosVizesPalack2 extends VizesPalack {
    private final double napiFolyadekBevitelCel;
    private double napiFolyadekBevitel;
    private Teto teto;


    public OkosVizesPalack2(String szin, String anyag, int urtartalom, double napiFolyadekBevitelCel) {
        super(szin, anyag, urtartalom);
        this.napiFolyadekBevitelCel = napiFolyadekBevitelCel;
        this.napiFolyadekBevitel = 0;
        this.teto = null;
    }

    public void tetoCsere(Teto t) {
        this.teto = t;
    }

    @Override
    public void vizivas(int mennyit) {
        if(jelenlegiMennyiseg-mennyit<0){
            napiFolyadekBevitel+=jelenlegiMennyiseg;
            jelenlegiMennyiseg=0;
        }
        else {
            napiFolyadekBevitel+=mennyit;
            jelenlegiMennyiseg-=mennyit;
        }
        if(napiFolyadekBevitel>=napiFolyadekBevitelCel) {
            System.out.println("Gratulalok! Elerted a napi celt!");
        }
    }

    public boolean folyik() {
        if (this.teto == null || !this.teto.isZart()) {
            return true;
        }
        return false;
    }

    public void nullaz() {
        this.napiFolyadekBevitel = 0;
    }

    public boolean dizajnos() {
        return this.teto.getSzin().equals(this.getSzin());
    }

    public String toString(){
        return "Ez egy " +this.getSzin()+ " szinu " +this.getAnyag()+ " anyagu vizespalack, amiben jelenleg " +jelenlegiMennyiseg+ " ml viz van. [Folyadekbevitel: " +napiFolyadekBevitel+"/"+napiFolyadekBevitelCel+" ml]";
    }
}
