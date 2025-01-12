import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        String[] args = {"cica", "lo", "kecske"};
        Felsorolas.main(args);
        assertEquals("Hibas kiiratas", String.join(System.lineSeparator(), "cica", "lo", "kecske") + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_02() {
        String[] args = {"medve"};
        Felsorolas.main(args);
        assertEquals("Hibas kiiratas", "medve" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_03() {
        String[] args = {};
        Felsorolas.main(args);
        assertEquals("Hibas kiiratas", "", sout.toString());
    }

    @Test
    public void teszt_04() {
        String[] args = {"div", "pre", "p", "q", "body", "head", "main", "footer"};
        Felsorolas.main(args);
        assertEquals("Hibas kiiratas", String.join(System.lineSeparator(), "div", "pre", "p", "q", "body", "head", "main", "footer") + System.lineSeparator(), sout.toString());
    }
}