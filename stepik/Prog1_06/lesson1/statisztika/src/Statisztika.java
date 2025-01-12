import java.util.HashSet;
import java.util.Set;

public class Statisztika {
    public Set<String> szovegek = new HashSet<>();

    public void hozzaad(String szoveg) {
        szovegek.add(szoveg);
    }

    public int tobbszorElofordulok() {
        return 0;
    }

}