import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Koordinata k1 = new Koordinata(3, 5, 7);
        Koordinata k2 = new Koordinata(k1);
        assertEquals("x erteke hibas", 3, (double) fieldValue(Koordinata.class, "x", k2), 0.001f);
        assertEquals("y erteke hibas", 5, (double) fieldValue(Koordinata.class, "y", k2), 0.001f);
        assertEquals("z erteke hibas", 7, (double) fieldValue(Koordinata.class, "z", k2), 0.001f);
    }

    @Test
    public void teszt_02() {
        Koordinata k1 = new Koordinata(3.5, 5.6, 7.7);
        Koordinata k2 = new Koordinata(k1);
        assertEquals("x erteke hibas", 3.5, (double) fieldValue(Koordinata.class, "x", k2), 0.001f);
        assertEquals("y erteke hibas", 5.6, (double) fieldValue(Koordinata.class, "y", k2), 0.001f);
        assertEquals("z erteke hibas", 7.7, (double) fieldValue(Koordinata.class, "z", k2), 0.001f);
    }

    @Test
    public void teszt_03() {
        Koordinata k1 = new Koordinata(-15.34, 0, 3.333);
        Koordinata k2 = new Koordinata(k1);
        assertEquals("x erteke hibas", -15.34, (double) fieldValue(Koordinata.class, "x", k2), 0.001f);
        assertEquals("y erteke hibas", 0, (double) fieldValue(Koordinata.class, "y", k2), 0.001f);
        assertEquals("z erteke hibas", 3.333, (double) fieldValue(Koordinata.class, "z", k2), 0.001f);
    }

    @Test
    public void teszt_04() {
        Koordinata k1 = new Koordinata(-754.11, 22.2, -51);
        Koordinata k2 = new Koordinata(k1);
        assertEquals("x erteke hibas", -754.11, (double) fieldValue(Koordinata.class, "x", k2), 0.001f);
        assertEquals("y erteke hibas", 22.2, (double) fieldValue(Koordinata.class, "y", k2), 0.001f);
        assertEquals("z erteke hibas", -51, (double) fieldValue(Koordinata.class, "z", k2), 0.001f);
    }
}