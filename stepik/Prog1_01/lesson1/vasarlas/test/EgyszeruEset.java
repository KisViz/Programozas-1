import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EgyszeruEset {
    public Bolt createBolt(String a, int b, float c) {
        Bolt bb = new Bolt();
        bb.nev = a;
        bb.almaAr = b;
        bb.almaTomeg = c;
        return bb;
    }

    @Test
    public void teszt_01() {
        Bolt[] boltok1 = {
                createBolt("Tesco", 500, 1)
        };

        assertEquals("Hibas ertek", "Tesco", Lista.vasarlas(boltok1));
    }

    @Test
    public void teszt_02() {
        Bolt[] boltok2 = {
                createBolt("Tesco", 400, 1),
                createBolt("Spar", 300, 1),
        };

        assertEquals("Hibas ertek", "Spar", Lista.vasarlas(boltok2));
    }

    @Test
    public void teszt_03() {
        Bolt[] boltok3 = {
                createBolt("Tesco", 400, 1),
                createBolt("Spar", 300, 1),
                createBolt("Lidl", 550, 1),
                createBolt("Aldi", 280, 1)
        };

        assertEquals("Hibas ertek", "Aldi", Lista.vasarlas(boltok3));
    }
}