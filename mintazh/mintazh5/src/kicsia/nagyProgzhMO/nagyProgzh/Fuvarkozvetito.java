import java.util.*;

public class Fuvarkozvetito {
    private boolean egySzemelyes;
    private Map<String, Integer> fuvarok;

    public Fuvarkozvetito(boolean egySzemelyes) {
        this.egySzemelyes = egySzemelyes;
        this.fuvarok = new HashMap<>();
    }

    public int[] lekerdezFuvar(String viszonylat) {
        if (fuvarok.containsKey(viszonylat)) {
            return new int[] {fuvarok.get(viszonylat), fuvarok.get(viszonylat)};
        } else {
            return new int[] {0, 0};
        }
    }

    public void fogadFuvar(String viszonylat, int tavolsag, int mennyiseg) {
        fuvarok.put(viszonylat, mennyiseg);
    }

    public void reagalTerkEpVltozas(String viszonylat, int ujTavolsag) {
        if (fuvarok.containsKey(viszonylat)) {
            fuvarok.put(viszonylat, ujTavolsag);
        } else {
            fuvarok.put(viszonylat, 0);
        }
    }

    public String[] rendezFuvarok(boolean tavolsagSzerint) {
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(fuvarok.entrySet());
        if (tavolsagSzerint) {
            sortedEntries.sort(Map.Entry.comparingByValue());
        } else {
            sortedEntries.sort(Map.Entry.comparingByKey());
        }
        String[] rendezettFuvarok = new String[sortedEntries.size()];
        for (int i = 0; i < sortedEntries.size(); i++) {
            Map.Entry<String, Integer> entry = sortedEntries.get(i);
            rendezettFuvarok[i] = entry.getKey();
        }
        return rendezettFuvarok;
    }

    public boolean fuvarvallalas(String vezeteknev, Map<String, Integer> fuvarok) {
        int osszesKilometer = 0;
        for (String viszonylat : fuvarok.keySet()) {
            if (this.fuvarok.containsKey(viszonylat)) {
                osszesKilometer += Math.min(this.fuvarok.get(viszonylat), fuvarok.get(viszonylat));
            }
        }
        if (osszesKilometer > 0) {
            for (String viszonylat : fuvarok.keySet()) {
                if (this.fuvarok.containsKey(viszonylat)) {
                    int mennyiseg = Math.min(this.fuvarok.get(viszonylat), fuvarok.get(viszonylat));
                    this.fuvarok.put(viszonylat, this.fuvarok.get(viszonylat) - mennyiseg);
                    fuvarok.put(viszonylat, mennyiseg);
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
