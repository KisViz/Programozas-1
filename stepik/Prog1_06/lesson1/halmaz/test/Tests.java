import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    Set<Integer> h1 = Halmaz.feltolt(5, 4, 2, 1, 1, 1, 7);
    Set<Integer> h2 = Halmaz.feltolt(10, 20, 4, -4, -5, -2);
    Set<Integer> h3 = Halmaz.feltolt(2, 2, 2, 2, 2);

    @Test
    public void feltolt() {
        assertEquals("feltolt hibas", 5, h1.size());
        assertTrue("feltolt hibas", h1.containsAll(Arrays.asList(1, 2, 4, 5, 7)));

        assertEquals("feltolt hibas", 6, h2.size());
        assertTrue("feltolt hibas", h2.containsAll(Arrays.asList(10, 20, 4, -4, -5, -2)));

        assertEquals("feltolt hibas", 1, h3.size());
        assertTrue("feltolt hibas", h3.contains(2));
    }

    @Test
    public void unio() {
        Set<Integer> u1 = Halmaz.unio(h1, h2);
        assertEquals("unio hibas", 5, h1.size());
        assertEquals("unio hibas", 6, h2.size());
        assertEquals("unio hibas", 10, u1.size());
        assertTrue("unio hibas", u1.containsAll(Arrays.asList(5, 4, 2, 1, 7, 10, 20, -4, -5, -2)));

        Set<Integer> u2 = Halmaz.unio(h2, h3);
        assertEquals("unio hibas", 1, h3.size());
        assertEquals("unio hibas", 6, h2.size());
        assertEquals("unio hibas", 7, u2.size());
        assertTrue("unio hibas", u2.containsAll(Arrays.asList(10, 20, 4, -4, -5, -2, 2)));
    }

    @Test
    public void metszet() {
        Set<Integer> m1 = Halmaz.metszet(h1, h2);
        Set<Integer> m2 = Halmaz.metszet(h3, h2);
        assertEquals("metszet hibas", 5, h1.size());
        assertEquals("metszet hibas", 6, h2.size());
        assertEquals("metszet hibas", 1, h3.size());
        assertEquals("metszet hibas", 1, m1.size());
        assertEquals("metszet hibas", 0, m2.size());
        assertTrue("metszet hibas", m1.contains(4));
    }

    @Test
    public void kulonbseg() {
        Set<Integer> u1 = Halmaz.feltolt(5, 4, 2, 1, 1, 1, 7, 10, 20, 4, -4, -5, -2);
        Set<Integer> u2 = Halmaz.feltolt(10, 20, 4, -4, -5, -2, 2, 2, 2, 2, 2);

        Set<Integer> k1 = Halmaz.kulonbseg(h1, h2);
        Set<Integer> k2 = Halmaz.kulonbseg(h3, h1);
        Set<Integer> k3 = Halmaz.kulonbseg(u2, u2);
        assertEquals("kulonbseg hibas", 5, h1.size());
        assertEquals("kulonbseg hibas", 6, h2.size());
        assertEquals("kulonbseg hibas", 1, h3.size());
        assertEquals("kulonbseg hibas", 10, u1.size());
        assertEquals("kulonbseg hibas", 7, u2.size());
        assertEquals("kulonbseg hibas", 4, k1.size());
        assertEquals("kulonbseg hibas", 0, k2.size());
        assertEquals("kulonbseg hibas", 0, k3.size());
        assertTrue("kulonbseg hibas", k1.containsAll(Arrays.asList(5, 2, 1, 7)));
    }
}