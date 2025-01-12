import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattagok() {
        testField(Bankszamla.class, "tulajdonos", String.class, Modifier.PRIVATE);
        testField(Bankszamla.class, "osszeg", int.class, Modifier.PRIVATE);
    }

    @Test
    public void konstruktor() {
        testConstructor(Bankszamla.class, Modifier.PUBLIC, String.class);

        Bankszamla b = new Bankszamla("Jutka");
        assertEquals("Jutka", fieldValue(Bankszamla.class, "tulajdonos", b));
        assertEquals(1000, fieldValue(Bankszamla.class, "osszeg", b));

        Bankszamla bb = new Bankszamla("HegyenLevoJanos");
        assertEquals("HegyenLevoJanos", fieldValue(Bankszamla.class, "tulajdonos", bb));
        assertEquals(1000, fieldValue(Bankszamla.class, "osszeg", bb));
    }

    @Test
    public void jovairas() {
        Bankszamla b = new Bankszamla("Peter");

        assertTrue(b.jovairas(440));
        assertEquals(1440, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.jovairas(560));
        assertEquals(2000, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.jovairas(4000));
        assertEquals(6000, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.jovairas(14000));
        assertEquals(20000, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.jovairas(70));
        assertEquals(20070, fieldValue(Bankszamla.class, "osszeg", b));
    }

    @Test
    public void koltes() {
        Bankszamla b = new Bankszamla("Peter");
        setFieldValue(Bankszamla.class, "osszeg", b, 100000);

        assertTrue(b.koltes(4000));
        assertEquals(96000, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.koltes(9600));
        assertEquals(86400, fieldValue(Bankszamla.class, "osszeg", b));

        assertFalse(b.koltes(100000));
        assertEquals(86400, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.koltes(86000));
        assertEquals(400, fieldValue(Bankszamla.class, "osszeg", b));

        assertFalse(b.koltes(401));
        assertEquals(400, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.koltes(0));
        assertEquals(400, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.koltes(400));
        assertEquals(0, fieldValue(Bankszamla.class, "osszeg", b));

        assertFalse(b.koltes(1));
        assertEquals(0, fieldValue(Bankszamla.class, "osszeg", b));

        assertTrue(b.koltes(0));
        assertEquals(0, fieldValue(Bankszamla.class, "osszeg", b));
    }

}