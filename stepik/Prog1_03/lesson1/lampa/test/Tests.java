import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattag() {
        testField(Lampa.class, "vilagit", boolean.class, Modifier.PRIVATE);
    }

    @Test
    public void konstruktor() {
        Lampa lampa = new Lampa(true);
        Lampa lampa2 = new Lampa(false);

        assertTrue((Boolean) fieldValue(Lampa.class, "vilagit", lampa));
        assertFalse((Boolean) fieldValue(Lampa.class, "vilagit", lampa2));
    }

    @Test
    public void getter() {
        Lampa lampa = new Lampa(true);
        Lampa lampa2 = new Lampa(false);

        assertTrue(lampa.isVilagit());
        assertFalse(lampa2.isVilagit());
    }

    @Test
    public void setter() {
        Lampa lampa = new Lampa(true);

        lampa.setVilagit(true);
        assertTrue((Boolean) fieldValue(Lampa.class, "vilagit", lampa));

        lampa.setVilagit(false);
        assertFalse((Boolean) fieldValue(Lampa.class, "vilagit", lampa));

        lampa.setVilagit(true);
        assertTrue((Boolean) fieldValue(Lampa.class, "vilagit", lampa));
    }

    @Test
    public void tostring() {
        Lampa lampa = new Lampa(true);
        assertEquals("vilagos van", lampa.toString());

        lampa = new Lampa(false);
        assertEquals("sotet van", lampa.toString());
    }
}