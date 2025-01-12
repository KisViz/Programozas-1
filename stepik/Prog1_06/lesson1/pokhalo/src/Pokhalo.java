import java.util.HashSet;
import java.util.Set;

public class Pokhalo {
    public Set<Pok> pokok = new HashSet<>();

    public double minimalisTavolsag() {
        double min = Double.MAX_VALUE;
        if (pokok.size() < 2) {
            return Double.NaN;
        }

        for (Pok pok1 : pokok) {

            for (Pok pok2 : pokok) {
                if (pok1 == pok2) {
                    continue;
                }

                double tav = Math.sqrt( Math.pow(pok2.posX - pok1.posX, 2) + Math.pow(pok2.posY - pok1.posY, 2) );

                if (tav < min) {
                    min = tav;
                }
            }
        }

        return min;
    }
}
