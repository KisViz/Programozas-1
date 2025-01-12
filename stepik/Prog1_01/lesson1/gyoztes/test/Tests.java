import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        setInput("Kiss Bela");
        Gyoztes.main(null);
        assertEquals("Hibas eredmeny", "A verseny gyoztese: Kiss Bela" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_02() {
        setInput("Kovacs Agnes");
        Gyoztes.main(null);
        assertEquals("Hibas eredmeny", "A verseny gyoztese: Kovacs Agnes" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_03() {
        setInput("Tablevenak Kince");
        Gyoztes.main(null);
        assertEquals("Hibas eredmeny", "A verseny gyoztese: Tablevenak Kince" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_04() {
        setInput("Antal Antal");
        Gyoztes.main(null);
        assertEquals("Hibas eredmeny", "A verseny gyoztese: Antal Antal" + System.lineSeparator(), sout.toString());
    }
}