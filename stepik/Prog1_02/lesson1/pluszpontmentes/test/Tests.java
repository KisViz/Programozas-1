import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", String.join(System.lineSeparator(), "David", "Peter", "Gyorgy", "Anett"),
                doArgumentTest(Pluszpontmentes.class, "David", "0", "Peter", "0", "Gyorgy", "0", "Anett", "0"));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "Akos",
                doArgumentTest(Pluszpontmentes.class, "David", "5", "Peter", "2", "Gyorgy", "1", "Akos", "0"));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "Joco",
                doArgumentTest(Pluszpontmentes.class, "Joco", "0", "Peter", "1.1", "Gyorgy", "4.2", "Anett", "0.7"));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", String.join(System.lineSeparator(), "David", "Antal"),
                doArgumentTest(Pluszpontmentes.class, "Mark", "1000000", "Tamas", "1", "David", "0", "Juliska", "15", "Antal", "0", "Gabor", "0.1", "Laszlo", "0.9"));
    }
}