import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        setInput("5");
        Eletkor.main(null);
        assertEquals("Hibas eredmeny", "Add meg az eletkorodat!" + System.lineSeparator() + "5 eves vagy." + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_02() {
        setInput("103");
        Eletkor.main(null);
        assertEquals("Hibas eredmeny", "Add meg az eletkorodat!" + System.lineSeparator() + "103 eves vagy." + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_03() {
        setInput("20");
        Eletkor.main(null);
        assertEquals("Hibas eredmeny", "Add meg az eletkorodat!" + System.lineSeparator() + "20 eves vagy." + System.lineSeparator(), sout.toString());
    }
}