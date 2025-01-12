
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class Tehergepjarmu implements Teherinterface {
    private  final List<Integer> fuvarok = new ArrayList<>();

    public int getKilometer() {
        int osszeg = 0;

        for (int penz: fuvarok) {
            osszeg += penz;
        }

        return osszeg;
    }

    public void kilometertTesz(int mennyit) {
        if (getKilometer() < mennyit) {
            throw new Teherkivetel("Nincs eleg kilometer!");
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
