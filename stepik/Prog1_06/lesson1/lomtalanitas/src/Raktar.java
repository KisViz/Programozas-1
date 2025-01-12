import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Raktar {
    private List<Targy> targyak;

    public Raktar() {
        targyak = new ArrayList<>();
    }

    public int lomtalanit() {
        int szaml=0;
        Iterator<Targy> it = targyak.iterator();
        while (it.hasNext()){
            Targy elem = it.next();
            if (elem.getErtek() == 0) {
                it.remove();
                szaml++;
            }
        }
        return szaml;
    }

    // megoldas
}