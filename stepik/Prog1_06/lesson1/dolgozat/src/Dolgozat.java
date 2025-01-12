import java.util.*;

public class Dolgozat {
    protected Map<String, Integer> pontszamok = new HashMap<>();

    public List<String> tehetsegesek(int pontszam) {
        List<String> pontok = new LinkedList<>();

        for (Map.Entry<String, Integer> elem : pontszamok.entrySet()) {
            if (elem.getValue() >= pontszam) {
                pontok.add(elem.getKey());
            }
        }

        return pontok;
    }


    // megoldas
}