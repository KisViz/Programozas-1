import java.util.ArrayList;
import java.util.List;

public class Paros {
    private List<Integer> szamok = new ArrayList<>();

    public void hozzaadas(int szam) {
        if (szam % 2 == 0) {
            szamok.add(szam);
        }
    }

    public void primszamokatTorol() {
        while (szamok.contains((Integer) 2)) {
            szamok.remove((Integer) 2);
        }
    }

    public List<Integer> getSzamok() {
        return new ArrayList<>(szamok);
    }
}