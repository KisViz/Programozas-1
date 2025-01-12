public class Szamitogep {
    // megoldas

    private String gyarto;
    private int memoriaMennyiseg;
    private int tarhelyMennyiseg;
    private boolean bekapcsolva;

    public Szamitogep() {
        this.gyarto = "";
        this.memoriaMennyiseg = 8;
        this.tarhelyMennyiseg = 500;
        this.bekapcsolva = false;
    }

    public Szamitogep(String gyarto, int memoriaMennyiseg, int tarhelyMennyiseg) {
        this.gyarto = gyarto;
        this.memoriaMennyiseg = memoriaMennyiseg;
        this.tarhelyMennyiseg = tarhelyMennyiseg;
        this.bekapcsolva = false;
    }

    public String getGyarto() {
        return gyarto;
    }

    public int getMemoriaMennyiseg() {
        return memoriaMennyiseg;
    }

    public int getTarhelyMennyiseg() {
        return tarhelyMennyiseg;
    }

    public boolean isBekapcsolva() {
        return bekapcsolva;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setMemoriaMennyiseg(int memoriaMennyiseg) {
        this.memoriaMennyiseg = memoriaMennyiseg;
    }

    public void setTarhelyMennyiseg(int tarhelyMennyiseg) {
        this.tarhelyMennyiseg = tarhelyMennyiseg;
    }


    public void bekapcsol(){
        this.bekapcsolva = true;
    }

    public void kikapcsol(){
        this.bekapcsolva = false;
    }

    public void memoriatBovit() {
        if (!bekapcsolva) {
            memoriaMennyiseg *= 2;
        } else {
            memoriaMennyiseg = 0;
            tarhelyMennyiseg = 0;
            bekapcsolva = false;
        }

    }

    public void tarhelyetBovit(int hanyszorosara) {
        if (!bekapcsolva) {
            tarhelyMennyiseg *= hanyszorosara;
        } else {
            memoriaMennyiseg = 0;
            tarhelyMennyiseg = 0;
            bekapcsolva = false;
        }
    }

    public double tarhelyMennyiseg() {
        return tarhelyMennyiseg / (double) memoriaMennyiseg;
    }

    @Override
    public String toString() {
        return "Szamitogep{" +
                "gyarto='" + gyarto + '\'' +
                ", memoriaMennyiseg=" + memoriaMennyiseg +
                ", tarhelyMennyiseg=" + tarhelyMennyiseg +
                ", bekapcsolva=" + bekapcsolva +
                '}';
    }






}