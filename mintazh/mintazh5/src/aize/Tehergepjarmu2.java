package aize;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tehergepjarmu2 {
    private final Set<Integer> fuvarok = new HashSet<>();

    public int getKilometer() {
        int osszeg = 0;

        for (int penz: fuvarok) {
            osszeg += penz;
        }

        return osszeg;
    }

    public void kilometertTesz(int mennyit) {
        if (getKilometer() < mennyit) {
            throw new IllegalArgumentException("Nincs eleg kilometer!");
        }

        Iterator<Integer> iterator = fuvarok.iterator();
        while (iterator.hasNext() && mennyit > 0) {
            int elem = iterator.next();
            mennyit -= elem;
            iterator.remove();
        }

        fuvarok.add(-mennyit);
    }
}
