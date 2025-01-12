import java.util.HashMap;
import java.util.Map;

public class Ember {
    private final String nev;
    private Sarkany[] sarkanyok;

    public Ember(String nev, int maxSari) {
        this.nev = nev;
        this.sarkanyok = new Sarkany[maxSari];
    }

    public Ember(int maxSari) {
        this.nev = "Noemi neni";
        this.sarkanyok = new Sarkany[maxSari];
    }

    public void sarkanySzuletik(Sarkany uj) {
        for (int i = 0; i < sarkanyok.length; i++) {
            if (sarkanyok[i] == null) {
                sarkanyok[i] = uj;
                return;
            }
        }

        double legkisebbe = sarkanyok[0].ero;
        int legisebbi = 0;
        for (int i = 0; i < sarkanyok.length; i++) {
            if (sarkanyok[i].ero < legkisebbe) {
                legkisebbe = sarkanyok[i].ero;
                legisebbi = i;
            }
        }
        sarkanyok[legisebbi] = uj;
    }

    public double osszErosseg() {
        double ossze = 0;
        for(Sarkany sari : sarkanyok) {
            if (sari != null) {
                ossze += sari.ero;
            }
        }

        return ossze;
    }

    public String leggyakrabbi() {
        Map<String, Integer> gyakorisag = new HashMap<>();
        for (Sarkany s: sarkanyok) {
            if (s != null) {
                gyakorisag.put(s.szin, gyakorisag.getOrDefault(s.szin, 0) + 1);
            }
        }

        int max = -1;
        String szin = null;
        for (Map.Entry<String, Integer> gyak: gyakorisag.entrySet()) {
            if (gyak.getValue() > max) {
                max = gyak.getValue();
                szin = gyak.getKey();
            }
        }

        return szin;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(this.nev + System.lineSeparator());
        for (Sarkany s : sarkanyok) {
            if (s != null) {
                res.append(s.toString()).append(System.lineSeparator());
            }
        }

        return res.toString();
    }
}