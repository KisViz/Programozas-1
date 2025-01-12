import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varos {
    List<Haz> hazak = new ArrayList<>();

    // megoldasok

    public void epites(Haz haz) {
        hazak.add(haz);
    }

    public void epites(Haz[] tomb) {
        hazak.addAll(Arrays.asList(tomb));
    }

    public void epites(List<Haz> h) {
        hazak.addAll(h);
    }

    public void epites(Varos v) {
        hazak.addAll(v.hazak);
    }
}