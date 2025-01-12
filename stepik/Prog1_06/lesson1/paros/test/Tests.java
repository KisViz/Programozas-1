import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        Paros p1 = new Paros();

        p1.hozzaadas(5);
        assertEquals("hibas lista", Collections.emptyList(), p1.getSzamok());

        p1.hozzaadas(8);
        assertEquals("hibas lista", Collections.singletonList(8), p1.getSzamok());

        p1.hozzaadas(5);
        assertEquals("hibas lista", Collections.singletonList(8), p1.getSzamok());

        p1.hozzaadas(4);
        assertEquals("hibas lista", Arrays.asList(8,4), p1.getSzamok());

        p1.hozzaadas(1);
        assertEquals("hibas lista", Arrays.asList(8,4), p1.getSzamok());

        p1.primszamokatTorol();
        assertEquals("hibas lista", Arrays.asList(8,4), p1.getSzamok());
    }

    @Test
    public void teszt_02() {
        Paros p2 = new Paros();

        p2.hozzaadas(0);
        assertEquals("hibas lista", Collections.singletonList(0), p2.getSzamok());

        p2.hozzaadas(1);
        assertEquals("hibas lista", Collections.singletonList(0), p2.getSzamok());

        p2.hozzaadas(2);
        assertEquals("hibas lista", Arrays.asList(0,2), p2.getSzamok());

        p2.hozzaadas(2);
        assertEquals("hibas lista", Arrays.asList(0,2,2), p2.getSzamok());

        p2.hozzaadas(16);
        assertEquals("hibas lista", Arrays.asList(0,2,2,16), p2.getSzamok());

        p2.primszamokatTorol();
        assertEquals("hibas lista", Arrays.asList(0,16), p2.getSzamok());

        for (int i = 0; i < 13440; i++) {
            p2.hozzaadas(2);
        }
        p2.primszamokatTorol();
        assertEquals("hibas lista", Arrays.asList(0,16), p2.getSzamok());
    }

}