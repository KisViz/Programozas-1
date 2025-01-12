import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt() {
        Gyumolcs a1 = new Alma(5, "piros");
        Gyumolcs a2 = new Alma(7, "kek");
        Gyumolcs e1 = new Eper(7, "piros");
        Gyumolcs m1 = new Malna(2, "zold");
        Gyumolcs m2 = new Malna(8, "rozsaszin");
        Gyumolcs p1 = new Paradicsom(10, "lila");

        Gyumolcskosar kosar = new Gyumolcskosar(3);

        assertEquals("gyumolcsSzam hibas", 0, kosar.gyumolcsSzam());

        boolean res = kosar.gyumolcsotHozzaad(a1);
        assertTrue("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertNull("gyumolcsotHozzaad nem jol mukodik", kosar.getGyumolcsok()[1]);
        assertNull("gyumolcsotHozzaad nem jol mukodik", kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 1, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(e1);
        assertTrue("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertNull("gyumolcsotHozzaad nem jol mukodik", kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 2, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(a1);
        assertFalse("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertNull("gyumolcsotHozzaad nem jol mukodik", kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 2, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(a2);
        assertFalse("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertNull("gyumolcsotHozzaad nem jol mukodik", kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 2, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(m1);
        assertTrue("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", m1, kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 3, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(m1);
        assertFalse("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", m1, kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 3, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(m2);
        assertFalse("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", m1, kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 3, kosar.gyumolcsSzam());

        res = kosar.gyumolcsotHozzaad(p1);
        assertFalse("gyumolcsotHozzaad nem jol mukodik", res);
        assertSame("gyumolcsotHozzaad nem jol mukodik", a1, kosar.getGyumolcsok()[0]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", e1, kosar.getGyumolcsok()[1]);
        assertSame("gyumolcsotHozzaad nem jol mukodik", m1, kosar.getGyumolcsok()[2]);
        assertEquals("gyumolcsSzam hibas", 3, kosar.gyumolcsSzam());
    }
}