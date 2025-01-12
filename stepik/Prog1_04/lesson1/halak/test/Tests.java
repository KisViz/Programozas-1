import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    Hal h1 = new Hal("harcsa", "barna", 74.3, 4);
    Hal h2 = new Hal("harcsa", "sarga", 77.33, 2);
    Hal h3 = new Hal("csuka", "sarga", 102.34, 6);
    Hal h4 = new Hal("ponty", "zold", 55.55, 4);
    Hal h5 = new Hal("aranyhal", "arany", 9.34, 1);

    @Test
    public void atmasolas_01() {
        To to = new To("Amdfmkl", 44.21, 7);

        Hal[] halak = new Hal[] {h1, h2, h3, h4, h5};
        setFieldValue(To.class, "halak", to, halak);

        To ujto = new To(to);
        assertEquals("nev hibas", "Amdfmkl", fieldValue(To.class, "nev", ujto));
        assertEquals("meret hibas", 44.21, (double) fieldValue(To.class, "meret", ujto), 0.0001f);

        Hal[] ujhalak = (Hal[]) fieldValue(To.class, "halak", ujto);
        assertEquals("halak hibas", h1, ujhalak[0]);
        assertEquals("halak hibas", h2, ujhalak[1]);
        assertEquals("halak hibas", h3, ujhalak[2]);
        assertEquals("halak hibas", h4, ujhalak[3]);
        assertEquals("halak hibas", h5, ujhalak[4]);
    }

    @Test
    public void atmasolas_02() {
        To to = new To("bdsn nsf", 21, 50);

        Hal[] halak = new Hal[] {h2, h3, null, null, null};
        setFieldValue(To.class, "halak", to, halak);

        To ujto = new To(to);
        assertEquals("nev hibas", "bdsn nsf", fieldValue(To.class, "nev", ujto));
        assertEquals("meret hibas", 21, (double) fieldValue(To.class, "meret", ujto), 0.0001f);

        Hal[] ujhalak = (Hal[]) fieldValue(To.class, "halak", ujto);
        assertEquals("halak hibas", h2, ujhalak[0]);
        assertEquals("halak hibas", h3, ujhalak[1]);
        assertNull("halak hibas", ujhalak[2]);
        assertNull("halak hibas", ujhalak[3]);
        assertNull("halak hibas", ujhalak[4]);
    }

    @Test
    public void fuggetlen_01() {
        To to = new To("bdsn nsf", 21, 50);

        Hal[] halak = new Hal[] {h2, h3};
        setFieldValue(To.class, "halak", to, halak);

        To ujto = new To(to);
        assertNotSame("A ket tomb nem fuggetlen", halak, fieldValue(To.class, "halak", ujto));

        halak[0] = null;
        assertNotNull("A ket tomb nem fuggetlen", ((Hal[])fieldValue(To.class, "halak", ujto))[0]);

        setFieldValue(Hal.class, "fajta", halak[1], "MACSKAHAL");
        setFieldValue(Hal.class, "szin", halak[1], "ROZSASZIN");
        setFieldValue(Hal.class, "meret", halak[1], 10000);
        setFieldValue(Hal.class, "kor", halak[1], 100);

        Hal ujHal = ((Hal[])fieldValue(To.class, "halak", ujto))[1];
        assertEquals("A halak nem fuggetlenek", "csuka", ujHal.getFajta());
        assertEquals("A halak nem fuggetlenek", "sarga", ujHal.getSzin());
        assertEquals("A halak nem fuggetlenek", 102.34, ujHal.getMeret(), 0.0001f);
        assertEquals("A halak nem fuggetlenek", 6, ujHal.getKor());
    }

    @Test
    public void fuggetlen_02() {
        To to = new To("bdsn nsf", 21, 50);

        Hal[] halak = new Hal[] {h2, h3, h4};
        setFieldValue(To.class, "halak", to, halak);

        To ujto = new To(to);
        assertNotSame("A ket tomb nem fuggetlen", halak, fieldValue(To.class, "halak", ujto));

        halak[0] = null;
        assertNotNull("A ket tomb nem fuggetlen", ((Hal[])fieldValue(To.class, "halak", ujto))[0]);

        setFieldValue(Hal.class, "fajta", halak[2], "MACSKAHAL2");
        setFieldValue(Hal.class, "szin", halak[2], "SARGA");
        setFieldValue(Hal.class, "meret", halak[2], 1000);
        setFieldValue(Hal.class, "kor", halak[2], 10);

        Hal ujHal = ((Hal[])fieldValue(To.class, "halak", ujto))[2];
        assertEquals("A halak nem fuggetlenek", "ponty", ujHal.getFajta());
        assertEquals("A halak nem fuggetlenek", "zold", ujHal.getSzin());
        assertEquals("A halak nem fuggetlenek", 55.55, ujHal.getMeret(), 0.0001f);
        assertEquals("A halak nem fuggetlenek", 4, ujHal.getKor());
    }
}