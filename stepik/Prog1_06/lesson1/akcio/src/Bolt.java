import java.util.ArrayList;
import java.util.List;

public class Bolt {
    protected String nev;
    protected List<Termek> termekek;

    public Bolt(String nev) {
        this.nev = nev;
        this.termekek = new ArrayList<>();
    }

    public void akcio() {
        for (Termek t : termekek) {
            if (t.nev.contains("husvet")) {
                t.ar = (int) (t.ar * 0.9);
            }
        }
    }

    // megoldas
}
