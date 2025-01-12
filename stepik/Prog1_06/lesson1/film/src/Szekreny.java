import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Szekreny {
    private Set<Film> filmek = new HashSet<>();

    public int filmeketKivalaszt(int maxHossz) {
//        filmek.removeIf(film -> film.getHossz() > maxHossz);

        int szaml= 0;

        Iterator<Film> film = filmek.iterator();
        while (film.hasNext()) {
            Film elem = film.next();
            if (elem.getHossz() > maxHossz) {
                film.remove();
                szaml++;
            }
        }
        return szaml;
    }

// megoldas
}