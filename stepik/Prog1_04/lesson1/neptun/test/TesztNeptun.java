import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesztNeptun {
    @Test
    public void teszt_01() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "Neptun elinditva!", n.elindit(1));
    }

    @Test
    public void teszt_02() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "Neptun elinditva!", n.elindit(10000));
    }

    @Test
    public void teszt_03() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "Neptun elinditva!", n.elindit(15000));
    }

    @Test
    public void teszt_04() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "Neptun elinditva!", n.elindit(135211));
    }

    @Test
    public void teszt_05() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "service is unavailable", n.elindit(135212));
    }

    @Test
    public void teszt_06() {
        Neptun n = new Neptun();
        assertEquals("neptun hibas", "service is unavailable", n.elindit(1000001));
    }
}
