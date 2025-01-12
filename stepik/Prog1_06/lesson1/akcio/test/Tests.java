import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Termek t1 = new Termek("husveti csibe", 100);
        Termek t2 = new Termek("mini husveti dekoracio", 50);
        Termek t3 = new Termek("kishusvet", 23);
        Termek t4 = new Termek("husvet", 16);

        Bolt bolt = new Bolt("LIDD");
        bolt.termekek.addAll(Arrays.asList(t1, t2, t3, t4));

        bolt.akcio();

        assertEquals(bolt.termekek.size(), 4);

        assertEquals("Hibas eredmeny", 90, t1.ar);
        assertEquals("Hibas eredmeny", 45, t2.ar);
        assertEquals("Hibas eredmeny", 20, t3.ar);
        assertEquals("Hibas eredmeny", 14, t4.ar);
    }

    @Test
    public void teszt_02() {
        Termek t5 = new Termek("karacsonyi nyuszi", 100);
        Termek t6 = new Termek("husmentes mikulas", 55);
        Termek t7 = new Termek("karacsonyi dekoracio", 200);

        Bolt bolt = new Bolt("LIDD");
        bolt.termekek.addAll(Arrays.asList(t5, t6, t7));

        bolt.akcio();

        assertEquals(bolt.termekek.size(), 3);

        assertEquals("Hibas eredmeny", 100, t5.ar);
        assertEquals("Hibas eredmeny", 55, t6.ar);
        assertEquals("Hibas eredmeny", 200, t7.ar);
    }

    @Test
    public void teszt_03() {
        Termek t1 = new Termek("husveti csibe", 100);
        Termek t3 = new Termek("kishusvet", 23);
        Termek t5 = new Termek("karacsonyi nyuszi", 100);
        Termek t7 = new Termek("karacsonyi dekoracio", 200);

        Bolt bolt = new Bolt("LIDD");
        bolt.termekek.addAll(Arrays.asList(t1, t5, t7, t3));

        bolt.akcio();

        assertEquals(bolt.termekek.size(), 4);

        assertEquals("Hibas eredmeny", 90, t1.ar);
        assertEquals("Hibas eredmeny", 100, t5.ar);
        assertEquals("Hibas eredmeny", 200, t7.ar);
        assertEquals("Hibas eredmeny", 20, t3.ar);
    }

    @Test
    public void teszt_04() {
        Bolt bolt = new Bolt("LIDD");
        bolt.termekek.addAll(Collections.emptyList());

        bolt.akcio();

        assertEquals(bolt.termekek.size(), 0);
    }
}