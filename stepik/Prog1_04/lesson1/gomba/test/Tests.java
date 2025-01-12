import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void ehetokSzama() {
        Gomba[] g1 = {
                new Gomba(true, 4),
                new Gomba(false, 7.4),
                new Gomba(false, 4.2),
                new Gomba(true, 2.7),
                new Gomba(true, 9.8),
                new Gomba(false, 5.4),
                new Gomba(false, 7.6),
                new Gomba(true, 3.2),
                new Gomba(false, 2.21)
        };

        Gomba[] g2 = {
                new Gomba(false, 13),
                new Gomba(true, 11),
                new Gomba(true, 7),
                new Gomba(true, 5.8),
                new Gomba(false, 5.5),
                new Gomba(true, 1),
                new Gomba(false, 5.7),
                new Gomba(true, 4),
                new Gomba(true, 2.4),
                new Gomba(true, 3),
                new Gomba(false, 2.1),
                new Gomba(false, 10.1),
                new Gomba(true, 10.3)
        };

        Gomba[] g3 = {};

        assertEquals("ehetokSzama metodus hibas", 4, Gomba.ehetokSzama(g1));
        assertEquals("ehetokSzama metodus hibas", 8, Gomba.ehetokSzama(g2));
        assertEquals("ehetokSzama metodus hibas", 0, Gomba.ehetokSzama(g3));
    }

    @Test
    public void legnagyobbEheto() {
        Gomba[] g1 = {
                new Gomba(true, 4),
                new Gomba(false, 7.4),
                new Gomba(false, 4.2),
                new Gomba(true, 2.7),
                new Gomba(true, 9.8),
                new Gomba(false, 5.4),
                new Gomba(false, 7.6),
                new Gomba(true, 3.2),
                new Gomba(false, 2.21)
        };

        Gomba[] g2 = {
                new Gomba(false, 13),
                new Gomba(true, 11.4),
                new Gomba(true, 11.33),
                new Gomba(true, 5.8),
                new Gomba(false, 5.5),
                new Gomba(true, 1),
                new Gomba(false, 5.7),
                new Gomba(true, 4),
                new Gomba(true, 2.4),
                new Gomba(true, 3),
                new Gomba(false, 2.1),
                new Gomba(false, 10.1),
                new Gomba(true, 10.3)
        };

        Gomba[] g3 = {};

        assertSame("legnagyobbEheto metodus hibas", g1[4], Gomba.legnagyobbEheto(g1));
        assertSame("legnagyobbEheto metodus hibas", g2[1], Gomba.legnagyobbEheto(g2));
        assertNull("legnagyobbEheto metodus hibas", Gomba.legnagyobbEheto(g3));
    }

    @Test
    public void nagyobbak() {
        Gomba[] g1 = {
                new Gomba(true, 4),
                new Gomba(false, 7.4),
                new Gomba(false, 4.2),
                new Gomba(true, 2.7),
                new Gomba(true, 9.8),
                new Gomba(false, 5.4),
                new Gomba(false, 7.6),
                new Gomba(true, 3.2),
                new Gomba(false, 2.21)
        };

        Gomba[] g1_mo = { g1[1], g1[4], g1[5], g1[6] };

        Gomba[] g2 = {
                new Gomba(false, 13),
                new Gomba(true, 11.4),
                new Gomba(true, 11.33),
                new Gomba(true, 6.65),
                new Gomba(false, 5.5),
                new Gomba(true, 1),
                new Gomba(false, 5.7),
                new Gomba(true, 4),
                new Gomba(true, 2.4),
                new Gomba(true, 3),
                new Gomba(false, 2.1),
                new Gomba(false, 10.1),
                new Gomba(true, 10.3)
        };

        Gomba[] g2_mo = { g2[0], g2[1], g2[2], g2[11], g2[12] };

        Gomba[] g3 = {};

        Gomba[] res1 = Gomba.nagyobbak(g1);
        Gomba[] res2 = Gomba.nagyobbak(g2);
        Gomba[] res3 = Gomba.nagyobbak(g3);

        assertEquals("nagyobbak metodus hibas", g1_mo.length, res1.length);
        assertEquals("nagyobbak metodus hibas", g2_mo.length, res2.length);
        assertEquals("nagyobbak metodus hibas", 0, res3.length);

        for (int i = 0; i <res1.length; i++) {
            assertSame("nagyobbak metodus hibas", g1_mo[i], res1[i]);
        }

        for (int i = 0; i <res2.length; i++) {
            assertSame("nagyobbak metodus hibas", g2_mo[i], res2[i]);
        }
    }

}