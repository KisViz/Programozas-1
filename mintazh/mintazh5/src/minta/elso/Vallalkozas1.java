package elso;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Vallalkozas1 implements KozosResz1 {
    private final List<Integer> befektetesek = new LinkedList<>();

    public int getPenz() {
        int osszeg = 0;

        for (int penz: befektetesek) {
            osszeg += penz;
        }

        return osszeg;
    }

    public void penztKolt(int mennyit) {
        if (getPenz() < mennyit) {
            throw new SajatException1("Nincs eleg penz!");
        }

        Iterator<Integer> iterator = befektetesek.iterator();
        while (iterator.hasNext() && mennyit > 0) {
            int elem = iterator.next();
            mennyit -= elem;
            iterator.remove();
        }

        befektetesek.add(-mennyit);
    }
}
