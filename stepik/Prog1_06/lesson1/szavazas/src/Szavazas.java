import java.util.HashMap;
import java.util.Map;

public class Szavazas {
    private Map<String, Integer> szavazatok = new HashMap<>();
                //nev   szavazatok szama
    public void hozzaad(String nev) {

        szavazatok.put(nev, szavazatok.getOrDefault(nev, 0) + 1);

        /*for (Map.Entry<String, Integer> elem : szavazatok.entrySet()) {
            if (szavazatok.containsKey(elem.getClass().getName())) {
                int eddigi = szavazatok.get(elem.getClass().getName());
                eddigi++;
                szavazatok.put(elem.getClass().getName(), eddigi);
            }
        }*/
    }

}