import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt() {
        Aru a1 = new Aru("a", 5);
        Aru a2 = new Aru("b", 50);
        Aru a3 = new Aru("cc", 4);
        Aru a4 = new Aru("d", 2);
        Aru a5 = new Aru("macskaillatu pamut-paralellepipedon", 100000000);

        Vasar v = new Vasar();
        Set<Aru> aruk = v.getAruk();

        v.hozzaad(a1);
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 1, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.contains(a1));

        v.hozzaad(a2);
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 2, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a2)));

        v.hozzaad(a3);
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 3, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a2, a3)));
        assertFalse("vasarolhato hibas", v.vasarolhato(a4));
        assertFalse("vasarolhato hibas", v.vasarolhato(a5));
        assertTrue("vasarolhato hibas", v.vasarolhato(a1));

        v.hozzaad(a4);
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 4, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a2, a3, a4)));
        assertTrue("vasarolhato hibas", v.vasarolhato(a4));
        assertFalse("vasarolhato hibas", v.vasarolhato(a5));
        assertTrue("vasarolhato hibas", v.vasarolhato(a1));

        assertTrue("megvasarol: hibas eredmeny", v.megvasarol(a4));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 3, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a2, a3)));

        assertTrue("megvasarol: hibas eredmeny", v.megvasarol(a2));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 2, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a3)));

        assertFalse("megvasarol: hibas eredmeny", v.megvasarol(a4));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 2, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.containsAll(Arrays.asList(a1, a3)));

        assertTrue("megvasarol: hibas eredmeny", v.megvasarol(a1));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 1, aruk.size());
        assertTrue("hozzaadas utan az aruk halmaza hibas", aruk.contains(a3));

        assertTrue("megvasarol: hibas eredmeny", v.megvasarol(a3));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 0, aruk.size());

        assertFalse("megvasarol: hibas eredmeny", v.megvasarol(a5));
        assertEquals("hozzaadas utan az aruk halmaza hibas meretu", 0, aruk.size());
    }
}