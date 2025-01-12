import java.util.Map;

public class Borton {
    Map<Ember, Integer> rabok;

    public Borton(Map<Ember, Integer> rabok) {
        this.rabok = rabok;
    }

    public Ember valasztas() {
        int minOles = Integer.MAX_VALUE;
        Ember embi = new Ember(0,"a");

        for (Map.Entry<Ember, Integer> rab : rabok.entrySet()) {
            if (rab.getValue() < minOles) {
                minOles = rab.getValue();
                embi = rab.getKey();
            }
        }

        return embi;
    }

}