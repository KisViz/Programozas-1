import java.util.HashMap;
import java.util.Map;

public class KincsesSziget implements Comparable<KincsesSziget>{
    /**
     * A sziget tulajdonosának neve
     */
    private String tulajdonos;
    /**
     * A sziget kincseit tartalmazó map.
     * A kulcs az adott kincs neve,
     * az érték, pedig a kincs minősége
     */
    private Map<String, Integer> kincsek = new HashMap<>();

    /**
     * A metódus meghatározza, hogy egy adott sziegeten mennyi
     * a kincsek összértéke. Egy kincs összértéke egyenlő, a kincs
     * minőségének és névhosszának az összegével
     * @return a kincsek összértéke
     */
    public int getKincsOsszeg(){ //csak szima map bejrás lesz:)
        int osszeg = 0;

        for (Map.Entry<String, Integer> kincs : kincsek.entrySet()) {
            osszeg += kincs.getValue() + kincs.getKey().length();
        }

        return osszeg;
    }

    /**
     * A metódus meghatározza melyik a értékesebb kincsessziget
     * @param o az összehasonlítandó kincs
     * @return az értékesebb kincses sziget
     */
    @Override
    public int compareTo(KincsesSziget o) { //implements comparable, genearte comparable      |      zh-ban nekünk kell ~kitalálni:)~

        if (this.getKincsOsszeg() < o.getKincsOsszeg()) {
            return -1; //akkor minusz, ha this kisebb   |   ha kisebb, akkor kisebb szamot adom vissza lokógika alapjan
        } else if (this.getKincsOsszeg() > o.getKincsOsszeg()) {
            return 1; //ha this nagyobb akkor a nagyobbat
        } else {
            return this.tulajdonos.compareTo(o.tulajdonos); //ez meg szotyi
        }
    }


}