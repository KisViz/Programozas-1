import java.util.Arrays;
import java.util.Objects;

public class Jatek {
    private String nev;
    private String[] genre;

    public Jatek(String nev) {
        this.nev = nev;
        this.genre = new String[3];
    }

    public Jatek(String nev, String... genre) {
        this.nev = nev;
        this.genre = new String[3];

        if (genre.length >= 3) { //ha nagyobb mint 3, akkor nincs baj
            for (int i = 0; i < 3; i++) {
                this.genre[i] = genre[i];
            }
        } else  { //ha kisebb mint 3, akkor eddig megyünk, amig van elem
            for (int i = 0; i < genre.length; i++) {
                this.genre[i] = genre[i];
            }
        }
    }

    public void addGenre (String name) {
        for (int i = 0; i < this.genre.length; i++) {
            if (this.genre[i] == null) {
                genre[i] = name;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) { //he?
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jatek jatek = (Jatek) o;
        return Objects.equals(nev, jatek.nev) && Arrays.equals(genre, jatek.genre);
    }

    @Override
    public int hashCode() { //mivaaan?
        int result = Objects.hash(nev);
        result = 31 * result + Arrays.hashCode(genre);
        return result;
    }

    /**--plusz---------------------*/

    public String getNev() {
        return nev;
    }
}
