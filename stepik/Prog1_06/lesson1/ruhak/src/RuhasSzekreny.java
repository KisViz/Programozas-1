import java.util.Iterator;
import java.util.List;

public class RuhasSzekreny {
    private List<Ruha> ruhak;

    public RuhasSzekreny(List<Ruha> ruhak) {
        this.ruhak = ruhak;
    }

    public void pirosakatTorol() {
        Iterator<Ruha> it = ruhak.iterator();

        while (it.hasNext()) {
            Ruha elem = it.next();
            if (elem.getSzin().equals("piros")) {
                it.remove();
            }
        }
    }


    // megoldas

    public List<Ruha> getRuhak() {
        return ruhak;
    }
}
