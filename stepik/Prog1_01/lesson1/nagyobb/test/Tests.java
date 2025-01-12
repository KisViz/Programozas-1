import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        Big.nagyobb(7, 3);
        assertEquals("Hibas eredmeny", "A nagyobb szam: 7" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_02() {
        Big.nagyobb(-7, 3);
        assertEquals("Hibas eredmeny", "A nagyobb szam: 3" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_03() {
        Big.nagyobb(-15, -50);
        assertEquals("Hibas eredmeny", "A nagyobb szam: -15" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_04() {
        Big.nagyobb(120, 92);
        assertEquals("Hibas eredmeny", "A nagyobb szam: 120" + System.lineSeparator(), sout.toString());
    }
}