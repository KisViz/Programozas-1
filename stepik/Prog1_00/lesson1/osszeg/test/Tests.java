import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt1() {
        setInput("3 5");
        Osszeg.main(new String[] {});
        assertEquals("Hibas eredmeny", sout.toString().trim(), "8");
    }

    @Test
    public void teszt2() {
        setInput("443 562");
        Osszeg.main(new String[] {});
        assertEquals("Hibas eredmeny", sout.toString().trim(), "1005");
    }

    @Test
    public void teszt3() {
        setInput("-4 -5");
        Osszeg.main(new String[] {});
        assertEquals("Hibas eredmeny", sout.toString().trim(), "-9");
    }
}