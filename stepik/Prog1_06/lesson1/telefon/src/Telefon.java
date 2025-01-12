import java.util.ArrayList;
import java.util.List;

public class Telefon {
    public List<Alkalmazas> alkalmazasok;

    public Telefon(List<Alkalmazas> alkalmazas) {
        this.alkalmazasok = alkalmazas;
    }

    public List<Alkalmazas> rendezettAlkalmazasok() {
        List<Alkalmazas> lista = new ArrayList<>(alkalmazasok);
        lista.sort((o1, o2) -> Integer.compare(o2.meret, o1.meret));
        return lista;
    }
}