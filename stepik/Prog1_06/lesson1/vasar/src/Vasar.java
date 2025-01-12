import java.util.HashSet;
import java.util.Set;

public class Vasar {
    private Set<Aru> aruk = new HashSet<>();

    public void hozzaad(Aru aru) {
        aruk.add(aru);
    }

    public boolean vasarolhato(Aru aru) {
        return aruk.contains(aru);
    }

    public boolean megvasarol(Aru aru) {
        if (vasarolhato(aru)) {
            aruk.remove(aru);
            return true;
        }
        return false;
    }

    public Set<Aru> getAruk() {
        return aruk;
    }
}
