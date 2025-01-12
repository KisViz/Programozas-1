import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValtozoTomeg {
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
                createBolt("Tesco", 500, 1),
                createBolt("Auchan", 990, 2)
        };

        assertEquals("Hibas ertek", "Auchan", Lista.vasarlas(boltok1));
    }

    @Test
    public void teszt_02() {
        Bolt[] boltok2 = {
                createBolt("Tesco", 400, 1),
                createBolt("Spar", 1250, 3),
        };

        assertEquals("Hibas ertek", "Tesco", Lista.vasarlas(boltok2));
    }

    @Test
    public void teszt_03() {
        Bolt[] boltok3 = {
                createBolt("Tesco", 155, 0.5f),
                createBolt("Spar", 195, 1),
                createBolt("Lidl", 450, 2),
                createBolt("Aldi", 1000, 5)
        };

        assertEquals("Hibas ertek", "Spar", Lista.vasarlas(boltok3));
    }

    @Test
    public void teszt_04() {
        Bolt[] boltok4 = {
                createBolt("Tesco", 200, 0.5f),
                createBolt("Spar", 220, 0.7f),
                createBolt("Lidl", 250, 0.9f),
                createBolt("Aldi", 150, 0.1f)
        };

        assertEquals("Hibas ertek", "Lidl", Lista.vasarlas(boltok4));
    }

    @Test
    public void teszt_05() {
        Bolt[] boltok5 = {
                createBolt("Tesco", 150, 0.1f),
                createBolt("Spar", 1000, 1.1f),
                createBolt("Lidl", 880, 2.4f),
                createBolt("Aldi", 36000, 100),
                createBolt("Auchan", 100, 0.1f)
        };

        assertEquals("Hibas ertek", "Aldi", Lista.vasarlas(boltok5));
    }
}
