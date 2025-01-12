public class OkosVizesPalack extends VizesPalack{
    private final double napiFolyadekBevitelCel;
    private double napiFolyadekBevitel;
    private Teto teto;

    public OkosVizesPalack(String szin, String anyag, int urtartalom, double napiFolyadekBevitelCel){
        super(szin,anyag,urtartalom);
        this.napiFolyadekBevitelCel=napiFolyadekBevitelCel;
        napiFolyadekBevitel=0;
        teto=null;
    }

    public void tetoCsere(Teto t){
        teto=t;
    }

    @Override
    public void vizivas(int mennyit){
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

    public boolean folyik(){
        if(teto==null || teto.isZart()==false) return true;
        return false;
    }

    public void nullaz(){
        napiFolyadekBevitel=0;
    }

    public boolean dizajnos(){
        if(teto.getSzin().equals(this.getSzin())) return true;
        return false;
    }

    public String toString(){
        return "Ez egy " +this.getSzin()+ " szinu " +this.getAnyag()+ " anyagu vizespalack, amiben jelenleg " +jelenlegiMennyiseg+ " ml viz van. [Folyadekbevitel: " +napiFolyadekBevitel+"/"+napiFolyadekBevitelCel+" ml]";
    }

}
