import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void testSolution() {
        Macska m1 = new Macska();
        Macska m2 = new Macska();
        Lo l1 = new Lo();
        Lo l2 = new Lo();
        Tehen t1 = new Tehen();
        Tehen t3 = new Tehen();


        Haz h = new Haz(5);
        assertEquals("a tomb merete nem megfelelo", 5, h.getAllatok().length);

        assertEquals("tevekenyseg hibas", "",getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(m1);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertNull("allatJon hibas", h.getAllatok()[1]);
        assertNull("allatJon hibas", h.getAllatok()[2]);
        assertNull("allatJon hibas", h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau",getSout(getMethod(Haz.class, "tevekenyseg"), h));


        h.allatJon(m2);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertNull("allatJon hibas", h.getAllatok()[2]);
        assertNull("allatJon hibas", h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(m2);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertNull("allatJon hibas", h.getAllatok()[2]);
        assertNull("allatJon hibas", h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(null);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertNull("allatJon hibas", h.getAllatok()[2]);
        assertNull("allatJon hibas", h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(t1);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertNull("allatJon hibas", h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(l1);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertSame("allatJon hibas", l1, h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" + System.lineSeparator() + "nyihaha" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(m2);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertSame("allatJon hibas", l1, h.getAllatok()[3]);
        assertNull("allatJon hibas", h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" + System.lineSeparator() + "nyihaha" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(t3);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertSame("allatJon hibas", l1, h.getAllatok()[3]);
        assertSame("allatJon hibas", t3, h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" + System.lineSeparator() + "nyihaha" + System.lineSeparator() + "tessek, tej" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(l2);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertSame("allatJon hibas", l1, h.getAllatok()[3]);
        assertSame("allatJon hibas", t3, h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" + System.lineSeparator() + "nyihaha" + System.lineSeparator() + "tessek, tej" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

        h.allatJon(null);
        assertSame("allatJon hibas", m1, h.getAllatok()[0]);
        assertSame("allatJon hibas", m2, h.getAllatok()[1]);
        assertSame("allatJon hibas", t1, h.getAllatok()[2]);
        assertSame("allatJon hibas", l1, h.getAllatok()[3]);
        assertSame("allatJon hibas", t3, h.getAllatok()[4]);
        assertEquals("tevekenyseg hibas", "Miau" + System.lineSeparator() + "Miau" + System.lineSeparator() + "tessek, tej" + System.lineSeparator() + "nyihaha" + System.lineSeparator() + "tessek, tej" ,getSout(getMethod(Haz.class, "tevekenyseg"), h));

    }
}