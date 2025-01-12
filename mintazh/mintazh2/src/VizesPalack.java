public class VizesPalack {
    private final String szin;
    private final String anyag;
    private final int urtartalom;
    protected double jelenlegiMennyiseg;


    public VizesPalack(String szin, String anyag, int urtartalom){
        this.szin=szin;
        this.anyag=anyag;
        this.urtartalom=urtartalom;
        jelenlegiMennyiseg=urtartalom;
    }

    public String getSzin() {
        return szin;
    }

    public String getAnyag() {
        return anyag;
    }

    public int getUrtartalom() {
        return urtartalom;
    }

    public double getJelenlegiMennyiseg() {
        return jelenlegiMennyiseg;
    }

    public void setJelenlegiMennyiseg(double jelenlegiMennyiseg){
        if(jelenlegiMennyiseg<0) this.jelenlegiMennyiseg=0;
        else if(jelenlegiMennyiseg>urtartalom) this.jelenlegiMennyiseg=urtartalom;
        else this.jelenlegiMennyiseg=jelenlegiMennyiseg;
    }

    public void ujratoltes(){
        jelenlegiMennyiseg=urtartalom;
    }

    public boolean ujratoltesSzukseges(){
        if(jelenlegiMennyiseg*100/urtartalom<20) return true;
        return false;
    }

    public void vizivas(int mennyit){
        if(jelenlegiMennyiseg-mennyit<0) jelenlegiMennyiseg=0;
        else jelenlegiMennyiseg-=mennyit;
    }

    public String toString(){
        return "Ez egy " + szin + " szinu " +anyag+ " anyagu vizespalack, amiben jelenleg " +jelenlegiMennyiseg+ " ml viz van.";
    }
}
