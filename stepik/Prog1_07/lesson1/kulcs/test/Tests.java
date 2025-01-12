import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void nemIllikAzarba() {
        assertTrue("NemIllikAZarba rossz helyrol oroklodik", testClass(NemIllikAZarba.class, Modifier.PUBLIC, Exception.class));
        Kulcs k1 = new Kulcs(null);
        Zar z1 = new Zar(null);

        NemIllikAZarba niaz = new NemIllikAZarba(k1, z1);
        assertSame("NemIllikAZarba kulcs lekerdezese hibas", k1, niaz.getKulcs());
        assertSame("NemIllikAZarba zar lekerdezese hibas", z1, niaz.getZar());
    }

    @Test
    public void marNyitvaVan() {
        assertTrue("MarNyitvaVan rossz helyrol oroklodik", testClass(MarNyitvaVan.class, Modifier.PUBLIC, Exception.class));
        Zar z1 = new Zar(null);

        MarNyitvaVan mnyv = new MarNyitvaVan(z1);
        assertSame("MarNyitvaVan zar lekerdezese hibas", z1, mnyv.getZar());
    }

    @Test
    public void marZarvaVan() {
        assertTrue("MarZarvaVan rossz helyrol oroklodik", testClass(NemIllikAZarba.class, Modifier.PUBLIC, Exception.class));
        Zar z1 = new Zar(null);

        MarZarvaVan mzv = new MarZarvaVan(z1);
        assertSame("MarZarvaVan zar lekerdezese hibas", z1, mzv.getZar());
    }

    @Test
    public void kulcs_Zar() {
        int[] m1 = {7, 8, 4, 2, 1, 10, 0, 0, -2};
        int[] m2 = {5, 1, 0, 0, 3};
        int[] n1 = {-7, -8, -4, -2, -1, -10, 0, 0, 2};
        int[] n2 = {-5, -1, 0, 0, -3};

        Zar z1 = new Zar(m1);
        Zar z2 = new Zar(m2);
        Zar z3 = new Zar(n1);
        Zar z5 = new Zar(m2);

        Kulcs k1 = new Kulcs(n1);
        Kulcs k2 = new Kulcs(n2);
        Kulcs k7 = new Kulcs(n1);

        assertFalse("nincs zarva kezdetben a zar", z1.isNyitva());
        assertFalse("nincs zarva kezdetben a zar", z2.isNyitva());

        try {
            k1.kinyit(z1);
            assertTrue("a zar nem nyilt ki", z1.isNyitva());
        } catch (NemIllikAZarba | MarNyitvaVan e) {
            fail("nem kellett volna kivetelt dobni: " + e.getMessage());
        }

        try {
            k1.kinyit(z1);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            fail("rossz kivetel dobodott");
        } catch (MarNyitvaVan e) {
            assertTrue("a zar nem nyilt ki", z1.isNyitva());
        }

        try {
            k7.kinyit(z1);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            fail("rossz kivetel dobodott");
        } catch (MarNyitvaVan e) {
            assertTrue("a zar nem nyilt ki", z1.isNyitva());
        }

        try {
            k1.kinyit(z2);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            assertFalse("a zar kinyilt", z2.isNyitva());
        } catch (MarNyitvaVan e) {
            fail("rossz kivetel dobodott");
        }

        try {
            k1.kinyit(z3);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            assertFalse("a zar kinyilt", z3.isNyitva());
        } catch (MarNyitvaVan e) {
            fail("rossz kivetel dobodott");
        }

        try {
            k2.kinyit(z2);
            assertTrue("a zar nem nyilt ki", z2.isNyitva());
        } catch (NemIllikAZarba | MarNyitvaVan e) {
            fail("nem kellett volna kivetelt dobni: " + e.getMessage());
        }

        try {
            k2.kinyit(z5);
            assertTrue("a zar nem nyilt ki", z5.isNyitva());
        } catch (NemIllikAZarba | MarNyitvaVan e) {
            fail("nem kellett volna kivetelt dobni: " + e.getMessage());
        }

        try {
            k1.bezar(z1);
            assertFalse("a zar nem zarult be", z1.isNyitva());
        } catch (NemIllikAZarba | MarZarvaVan e) {
            fail("nem kellett volna kivetelt dobni: " + e.getMessage());
        }

        try {
            k1.bezar(z1);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            fail("rossz kivetel dobodott");
        } catch (MarZarvaVan e) {
            assertFalse("a zar nem zarult be", z1.isNyitva());
        }

        try {
            k2.bezar(z3);
            fail("kivetelt kellett volna dobni");
        } catch (NemIllikAZarba e) {
            assertTrue("a zar bezarult", z5.isNyitva());
        } catch (MarZarvaVan e) {
            fail("rossz kivetel dobodott");
        }
    }
}