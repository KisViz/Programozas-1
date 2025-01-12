import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void legjobb() {
        Hangszer[] h1 = {
                new Hangszer(5, 3, true, true),
                new Hangszer(4, 10, false, true),
                new Hangszer(7, 2, false, true),
                new Hangszer(3, 9, true, false),
                new Hangszer(1, 5, true, true),
                new Hangszer(8, 5, false, false),
                new Hangszer(6, 3, false, false),
                new Hangszer(2, 8, true, true)
        };

        Hangszer[] h2 = {
                new Hangszer(3, 3, false, true),
                new Hangszer(30, 7, true, false),
                new Hangszer(8, 4, true, true),
                new Hangszer(13, 6, true, false),
                new Hangszer(11, 5, true, false),
                new Hangszer(6, 1, false, true),
                new Hangszer(4, 9, false, false),
                new Hangszer(7, 3, false, false),
                new Hangszer(1, 5, false, false),
                new Hangszer(10, 10, false, false),
                new Hangszer(12, 4, true, false),
                new Hangszer(2, 1, false, true),
        };

        Hangverseny hv1 = new Hangverseny(h1);
        Hangverseny hv2 = new Hangverseny(h2);
        Hangverseny hv3 = new Hangverseny(new Hangszer[] {});

        assertSame("legjobb metodus hibas", h1[5], hv1.legjobb());
        assertSame("legjobb metodus hibas", h2[1], hv2.legjobb());
        assertNull("legjobb metodus ures tombre hibas", hv3.legjobb());
    }

    @Test
    public void kitiltas() {
        Hangszer[] h1 = {
                new Hangszer(5, 3, true, true),
                new Hangszer(4, 10, false, true),
                new Hangszer(7, 2, false, true),
                new Hangszer(3, 9, true, false),
                new Hangszer(1, 5, true, true),
                new Hangszer(8, 5, false, false),
                new Hangszer(6, 3, false, false),
                new Hangszer(2, 8, true, true)
        };

        Hangszer[] h2 = {
                new Hangszer(3, 3, false, true),
                new Hangszer(30, 7, true, false),
                new Hangszer(8, 4, true, true),
                new Hangszer(13, 6, true, false),
                new Hangszer(11, 5, true, false),
                new Hangszer(6, 1, false, true),
                new Hangszer(4, 9, false, false),
                new Hangszer(7, 3, false, false),
                new Hangszer(1, 5, false, false),
                new Hangszer(10, 10, false, false),
                new Hangszer(12, 4, true, false),
                new Hangszer(2, 1, false, true),
        };

        Hangverseny hv1 = new Hangverseny(h1);
        Hangverseny hv2 = new Hangverseny(h2);
        Hangverseny hv3 = new Hangverseny(new Hangszer[] {});

        assertEquals("kitiltas metodus hibas", 2, hv1.kitiltas());
        assertEquals("kitiltas metodus hibas", 4, hv2.kitiltas());
        assertEquals("kitiltas metodus hibas", 0, hv3.kitiltas());
    }

    @Test
    public void leghangosabbHarfaGitar() {
        Hangszer[] h1 = {
                new Hangszer(5, 3, true, true),
                new Hangszer(4, 10, false, true),
                new Hangszer(7, 2, false, true),
                new Hangszer(3, 9, true, false),
                new Hangszer(1, 5, true, true),
                new Hangszer(8, 5, false, false),
                new Hangszer(6, 3, false, false),
                new Hangszer(2, 8, true, true)
        };

        Hangszer[] h2 = {
                new Hangszer(3, 3, false, true),
                new Hangszer(30, 7, true, false),
                new Hangszer(8, 4, true, true),
                new Hangszer(13, 6, true, false),
                new Hangszer(11, 5, true, false),
                new Hangszer(6, 1, false, true),
                new Hangszer(4, 9, false, false),
                new Hangszer(7, 3, false, false),
                new Hangszer(1, 5, false, false),
                new Hangszer(10, 10, false, false),
                new Hangszer(12, 4, true, false),
                new Hangszer(2, 1, false, true),
        };

        Hangverseny hv1 = new Hangverseny(h1);
        Hangverseny hv2 = new Hangverseny(h2);
        Hangverseny hv3 = new Hangverseny(new Hangszer[] {});

        assertSame("leghangosabbHarfaGitar metodus hibas", h1[7], hv1.leghangosabbHarfaGitar());
        assertSame("leghangosabbHarfaGitar metodus hibas", h2[2], hv2.leghangosabbHarfaGitar());
        assertNull("leghangosabbHarfaGitar metodus hibas", hv3.leghangosabbHarfaGitar());
    }

    @Test
    public void rangsor() {
        Hangszer[] h1 = {
                new Hangszer(5, 3, true, true),
                new Hangszer(4, 10, false, true),
                new Hangszer(7, 2, false, true),
                new Hangszer(3, 9, true, false),
                new Hangszer(1, 5, true, true),
                new Hangszer(8, 5, false, false),
                new Hangszer(6, 3, false, false),
                new Hangszer(2, 8, true, true)
        };

        Hangszer[] h1_ok = { h1[5], h1[2], h1[6], h1[0], h1[1], h1[3], h1[7], h1[4] };

        Hangszer[] h2 = {
                new Hangszer(3, 3, false, true),
                new Hangszer(30, 7, true, false),
                new Hangszer(8, 4, true, true),
                new Hangszer(13, 6, true, false),
                new Hangszer(11, 5, true, false),
                new Hangszer(6, 1, false, true),
                new Hangszer(4, 9, false, false),
                new Hangszer(7, 3, false, false),
                new Hangszer(1, 5, false, false),
                new Hangszer(10, 10, false, false),
                new Hangszer(12, 4, true, false),
                new Hangszer(2, 1, false, true),
        };

        Hangszer[] h2_ok = { h2[1], h2[3], h2[10], h2[4], h2[9], h2[2], h2[7], h2[5], h2[6], h2[0], h2[11], h2[8] };

        Hangverseny hv1 = new Hangverseny(h1);
        Hangverseny hv2 = new Hangverseny(h2);
        Hangverseny hv3 = new Hangverseny(new Hangszer[] {});

        hv1.rangsor();
        for (int i = 0; i < h1.length; i++) {
            assertSame("rangsor metodus hibas", hv1.getHangszerek()[i], h1_ok[i]);
        }

        hv2.rangsor();
        for (int i = 0; i < h2.length; i++) {
            assertSame("rangsor metodus hibas", hv2.getHangszerek()[i], h2_ok[i]);
        }

        hv3.rangsor();
        assertSame("rangsor metodus hibas", 0 ,hv3.getHangszerek().length);
    }

}
