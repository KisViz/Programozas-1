import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {
    Aru a1 = new Aru("Kenyer", 8000);
    Aru a2 = new Aru("Villamosjegy", 1500);
    Aru a3 = new Aru("Euro", 750);
    Aru a4 = new Aru("Benzin", 1460);
    Aru a5 = new Aru("Tank", 10000);
    Aru a6 = new Aru("Voros szinu zaszlo", 10);

    @Test
    public void teszt_01() {
        int penz = 1000;
        List<Aru> aruk = Arrays.asList(a6, a6, a6);
        int hiany = -970;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }

    @Test
    public void teszt_02() {
        int penz = 20;
        List<Aru> aruk = Arrays.asList(a6, a6, a6);
        int hiany = 10;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }

    @Test
    public void teszt_03() {
        int penz = 10250;
        List<Aru> aruk = Arrays.asList(a1, a2, a3);
        int hiany = 0;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }

    @Test
    public void teszt_04() {
        int penz = 1;
        List<Aru> aruk = Arrays.asList(a1, a2, a3);
        int hiany = 10249;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }

    @Test
    public void teszt_05() {
        int penz = 10000;
        List<Aru> aruk = Arrays.asList(a1, a2, a3, a4, a4, a4, a5, a5, a6);
        int hiany = 24640;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }

    @Test
    public void teszt_06() {
        int penz = 10;
        List<Aru> aruk = Collections.emptyList();
        int hiany = -10;

        ElfogyottAPenzException e = new ElfogyottAPenzException(penz, aruk);
        assertEquals("Hibas hibauzenet", "A megvasarolt termekek ara " + (hiany) + " Ft-tal magasabb, mint a rendelkezesre allo penzunk", e.getMessage());
    }
}
