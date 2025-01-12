import java.util.LinkedList;
import java.util.List;

public class Parkolo {
    private List<Auto> autok;
    private int kapacitas;

    public Parkolo(int kapacitas) {
        this.autok = new LinkedList<>();
        this.kapacitas = kapacitas;
    }

    public void beall(Auto a) {
        if (autok.size() < kapacitas) {
            autok.add(a);
        }
    }

    public void kiall(Auto a) {
        autok.remove(a);
    }

    public void ledozerol() {
        autok.clear();
        this.kapacitas = 0;
    }

    public void bovit() {
        this.kapacitas *= 2;
    }

    // tobbi metodus


    public int getKapacitas() {
        return kapacitas;
    }

    public List<Auto> getAutok() {
        return autok;
    }
}