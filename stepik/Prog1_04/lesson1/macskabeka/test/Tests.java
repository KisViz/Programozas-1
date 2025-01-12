import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        setFieldValue(Beka.class, "num", null, 0);
        setFieldValue(Macska.class, "num", null, 0);

        String res = doArgumentTest(Main.class, "Macska", "cirmi", "3");
        assertEquals("Hibas kiiratas", "MACSKA:cirmi3", res);
        assertEquals("Hibas kiiratas", "", serr.toString());

        assertEquals("Hibas letrehozas", 0, fieldValue(Beka.class, "num", null));
        assertEquals("Hibas letrehozas", 1, fieldValue(Macska.class, "num", null));
    }

    @Test
    public void teszt_02() {
        setFieldValue(Beka.class, "num", null, 0);
        setFieldValue(Macska.class, "num", null, 0);

        String res = doArgumentTest(Main.class, "Beka", "zold");
        assertEquals("Hibas kiiratas", "BEKA:zold", res);
        assertEquals("Hibas kiiratas", "", serr.toString());

        assertEquals("Hibas letrehozas", 1, fieldValue(Beka.class, "num", null));
        assertEquals("Hibas letrehozas", 0, fieldValue(Macska.class, "num", null));
    }

    @Test
    public void teszt_03() {
        setFieldValue(Beka.class, "num", null, 0);
        setFieldValue(Macska.class, "num", null, 0);

        String res = doArgumentTest(Main.class, "Macska", "cirmi", "3", "Beka", "zold", "Beka", "kek", "Macska", "cirmi2", "5");
        assertEquals("Hibas kiiratas", "MACSKA:cirmi3" + System.lineSeparator() + "BEKA:zold" + System.lineSeparator() + "BEKA:kek" + System.lineSeparator() + "MACSKA:cirmi25", res);
        assertEquals("Hibas kiiratas", "", serr.toString());

        assertEquals("Hibas letrehozas", 2, fieldValue(Beka.class, "num", null));
        assertEquals("Hibas letrehozas", 2, fieldValue(Macska.class, "num", null));
    }

    @Test
    public void teszt_04() {
        setFieldValue(Beka.class, "num", null, 0);
        setFieldValue(Macska.class, "num", null, 0);

        String res = doArgumentTest(Main.class, "Kecske", "piros", "3");
        assertEquals("Hibas kiiratas", "", res);
        assertEquals("Hibas kiiratas", "HIBA" + System.lineSeparator() + "HIBA" + System.lineSeparator() + "HIBA" + System.lineSeparator(), serr.toString());

        assertEquals("Hibas letrehozas", 0, fieldValue(Beka.class, "num", null));
        assertEquals("Hibas letrehozas", 0, fieldValue(Macska.class, "num", null));
    }

    @Test
    public void teszt_05() {
        setFieldValue(Beka.class, "num", null, 0);
        setFieldValue(Macska.class, "num", null, 0);

        String res = doArgumentTest(Main.class, "Beka", "piros", "Kecske", "Macska", "cirmi", "5", "5", "5", "Beka", "kek", "1");
        assertEquals("Hibas kiiratas", "BEKA:piros" + System.lineSeparator() + "MACSKA:cirmi5" + System.lineSeparator() + "BEKA:kek", res);
        assertEquals("Hibas kiiratas", "HIBA" + System.lineSeparator() + "HIBA" + System.lineSeparator() + "HIBA" + System.lineSeparator() + "HIBA" + System.lineSeparator(), serr.toString());

        assertEquals("Hibas letrehozas", 2, fieldValue(Beka.class, "num", null));
        assertEquals("Hibas letrehozas", 1, fieldValue(Macska.class, "num", null));
    }
}