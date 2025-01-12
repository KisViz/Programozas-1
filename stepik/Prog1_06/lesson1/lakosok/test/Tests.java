import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt() {
        /* EMBEREK */

        Ember e1 = new Ember(5);
        Ember e2 = new Ember(7);
        Ember e3 = new Ember(10);
        Ember e4 = new Ember(11);
        Ember e5 = new Ember(25);
        Ember e6 = new Ember(28);
        Ember e7 = new Ember(30);
        Ember e8 = new Ember(32);
        Ember e9 = new Ember(34);
        Ember e10 = new Ember(35);
        Ember e11 = new Ember(37);
        Ember e12 = new Ember(40);
        Ember e13 = new Ember(47);
        Ember e14 = new Ember(55);
        Ember e15 = new Ember(74);
        Ember e16 = new Ember(78);
        Ember e17 = new Ember(140);

        /* HAZAK */

        Haz h1 = new Haz();
        Haz h2 = new Haz();
        Haz h3 = new Haz();
        Haz h4 = new Haz();
        Haz h5 = new Haz();
        Haz h6 = new Haz();
        Haz h7 = new Haz();

        /* UTCAK */

        Utca u1 = new Utca();
        u1.hazak.add(h1);

        Utca u2 = new Utca();
        u2.hazak.add(h2);
        u2.hazak.add(h3);

        Utca u3 = new Utca();
        u3.hazak.add(h4);
        u3.hazak.add(h5);
        u3.hazak.add(h6);
        u3.hazak.add(h7);

        Utca u4 = new Utca();

        /* VAROSOK */
        Varos v1 = new Varos();
        v1.fovaros = false;
        v1.utcak.add(u1);
        v1.utcak.add(u2);

        Varos v2 = new Varos();
        v2.fovaros = true;
        v2.utcak.add(u3);
        v2.utcak.add(u4);

        Varos v3 = new Varos();
        v3.fovaros = true;

        /* MEGYE */
        Megye m1 = new Megye();
        m1.varosok.add(v1);

        Megye m2 = new Megye();
        m2.varosok.add(v3);

        Megye m3 = new Megye();

        /* Orszag */
        Orszag o1 = new Orszag();
        o1.megyek.add(m1);
        o1.megyek.add(m3);

        Orszag o2 = new Orszag();
        o2.megyek.add(m2);

        Vilag v = new Vilag();
        v.orszagok.add(o1);
        v.orszagok.add(o2);

        h1.lakok.add(e1);
        h3.lakok.add(e6);

        assertEquals("legoregebbEmber hibas", e6, v.legoregebbEmber());
        assertTrue("fovarosok hibas", listEquals(v.fovarosok(), v3));
        assertEquals("lakossag hibas", 2, v.lakossag());

        m1.varosok.add(v2);
        h4.lakok.add(e7);
        h4.lakok.add(e8);
        h4.lakok.add(e9);
        h2.lakok.add(e3);
        h2.lakok.add(e4);
        h3.lakok.add(e5);

        assertEquals("legoregebbEmber hibas", e9, v.legoregebbEmber());
        assertTrue("fovarosok hibas", listEquals(v.fovarosok(), v2, v3));
        assertEquals("lakossag hibas", 8, v.lakossag());

        h5.lakok.add(e10);
        h5.lakok.add(e12);
        h5.lakok.add(e13);
        h6.lakok.add(e14);
        h6.lakok.add(e15);

        assertEquals("legoregebbEmber hibas", e15, v.legoregebbEmber());
        assertTrue("fovarosok hibas", listEquals(v.fovarosok(), v2, v3));
        assertEquals("lakossag hibas", 13, v.lakossag());

        h6.lakok.add(e16);
        h5.lakok.add(e11);
        h1.lakok.add(e2);
        h7.lakok.add(e17);

        assertEquals("legoregebbEmber hibas", e17, v.legoregebbEmber());
        assertTrue("fovarosok hibas", listEquals(v.fovarosok(), v2, v3));
        assertEquals("lakossag hibas", 17, v.lakossag());
    }

    private boolean listEquals(List<Varos> lista, Varos... varosok) {
        if (lista.size() != varosok.length) {
            return false;
        }

        for (Varos v: varosok) {
            if (!lista.contains(v)) {
                return false;
            }
        }

        return true;
    }
}