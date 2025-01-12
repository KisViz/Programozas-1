package elso;

import java.util.HashMap;
import java.util.Map;

public class Bolt1 {
    private Map<String, Integer> arukNevDb = new HashMap<>();
    private Map<String, Integer> arukNevAr = new HashMap<>();

    private boolean nagyker;

    public Bolt1(boolean nagyker) {
        this.nagyker = nagyker;
    }

    public int[] getArMenny(String nev) {
        if (nev == null) {
            return new int[2];
        }
        if (!arukNevDb.containsKey(nev)) {
            return new int[2];
        }

        int[] adarok = new int[2];
        adarok[0] = arukNevAr.get(nev);
        adarok[1] = arukNevDb.get(nev);
        return adarok;
    }

    public void ujSzallitmany(String aruNev, int mennyit) {
        if (arukNevDb.containsKey(aruNev)) {
            int mennyi = arukNevDb.get(aruNev);
            arukNevDb.put(aruNev, mennyi+mennyit);
        } else {
            arukNevDb.put(aruNev, mennyit);
            arukNevAr.put(aruNev, 1000);
        }
    }

    public void arvaltozas(String nev, int minAr, int ajanlottAr) {
        if (arukNevDb.containsKey(nev)) {
            if (this.nagyker) {
                arukNevAr.remove(nev);
                arukNevAr.put(nev, minAr);
            } else {
                arukNevAr.remove(nev);
                arukNevAr.put(nev, ajanlottAr);
            }
        }
    }


}
