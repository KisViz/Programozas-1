public class VizesPalack2 {
    private final String szin;
    private final String anyag;
    private final int urtaltalom;
    protected double jelenlegiMennyiseg;

    public VizesPalack2(String szin, String anyag, int urtaltalom) {
        this.szin = szin;
        this.anyag = anyag;
        this.urtaltalom = urtaltalom;
        this.jelenlegiMennyiseg = urtaltalom;
    }

    public void setJelenlegiMennyiseg(double jelenlegiMennyiseg) {
        this.jelenlegiMennyiseg = Math.min(urtaltalom, Math.max(0, jelenlegiMennyiseg));
    }

    public void ujratoltes() {
        this.jelenlegiMennyiseg = this.urtaltalom;
    }

    public boolean ujratoltesSzukseges() {
        return (this.jelenlegiMennyiseg / this.urtaltalom) * 100 < 20;
    }

    public void vizivas(int mennyi) {
        this.jelenlegiMennyiseg =- mennyi;
        if (this.jelenlegiMennyiseg <0) {
            this.jelenlegiMennyiseg = 0;
        }
    }

    public String toString(){
        return "Ez egy " + szin + " szinu " +anyag+ " anyagu vizespalack, amiben jelenleg " +jelenlegiMennyiseg+ " ml viz van.";
    }

    public String getSzin() {
        return szin;
    }

    public String getAnyag() {
        return anyag;
    }

    public int getUrtaltalom() {
        return urtaltalom;
    }

    public double getJelenlegiMennyiseg() {
        return jelenlegiMennyiseg;
    }
}
