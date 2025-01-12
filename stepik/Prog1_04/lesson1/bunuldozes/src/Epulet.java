import java.util.*;

public class Epulet {
    private Pozicio startPozicio;
    private Pozicio[] bunozok;
    private Pozicio[] falak;
    private Pozicio[] konyvespolcok;
    private Pozicio[] asztalok;
    private Pozicio[] ajtok;

    // erdemes letrehozni egyeb adattagokat, metodusokat

    public int lepesekSzama() {
        return 0;
    }

    public Epulet(Pozicio startPozicio, Pozicio[] bunozok, Pozicio[] falak, Pozicio[] konyvespolcok, Pozicio[] asztalok, Pozicio[] ajtok) {
        this.startPozicio = startPozicio;
        this.bunozok = bunozok;
        this.falak = falak;
        this.konyvespolcok = konyvespolcok;
        this.asztalok = asztalok;
        this.ajtok = ajtok;
    }

}