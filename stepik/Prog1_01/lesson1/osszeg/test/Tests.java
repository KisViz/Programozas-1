import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        setInput("-1");
        Osszeg.main(null);
        assertEquals("Hibas eredmeny", "A pontszamok osszege: 0", sout.toString().trim());
    }

    @Test
    public void teszt_02() {
        setInput("0 0 0 0 0 0 2 -1");
        Osszeg.main(null);
        assertEquals("Hibas eredmeny", "A pontszamok osszege: 2", sout.toString().trim());
    }

    @Test
    public void teszt_03() {
        setInput("3 5 1 0 5 3 1 2 4 0 1 0 0 \n 5 2 -1");
        Osszeg.main(null);
        assertEquals("Hibas eredmeny", "A pontszamok osszege: 32", sout.toString().trim());
    }

    @Test
    public void teszt_04() {
        setInput("1     \n\r    \t   -1");
        Osszeg.main(null);
        assertEquals("Hibas eredmeny", "A pontszamok osszege: 1", sout.toString().trim());
    }
}