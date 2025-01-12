import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Beosztas {
    protected Map<String, Feladat> beosztas = new HashMap<>();

    public Map<Feladat, String> megfordit() {
        Map<Feladat, String> forditott = new HashMap<>();

        for (Map.Entry<String, Feladat> elem : beosztas.entrySet()) {
            forditott.put(elem.getValue(),elem.getKey());
        }

        if (beosztas.size() != forditott.size()) {
            return null;
        }

        return forditott;
    }

    // megoldas
}