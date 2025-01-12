import com.sun.org.apache.xpath.internal.Arg;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        Argumentumok.main(new String[]{});
        assertEquals("hibas eredmeny", "", sout.toString());
    }

    @Test
    public void teszt_02() {
        Argumentumok.main(new String[]{"egy"});
        assertEquals("hibas eredmeny", "", sout.toString());
    }

    @Test
    public void teszt_03() {
        Argumentumok.main(new String[]{"egy", "ketto"});
        assertEquals("hibas eredmeny", "ketto", sout.toString().trim());
    }

    @Test
    public void teszt_04() {
        Argumentumok.main(new String[]{"neptun", "macska"});
        assertEquals("hibas eredmeny", "macska", sout.toString().trim());
    }

    @Test
    public void teszt_05() {
        Argumentumok.main(new String[]{"neptun", "kaktusz", "nyuszi"});
        assertEquals("hibas eredmeny", "kaktusz", sout.toString().trim());
    }

    @Test
    public void teszt_06() {
        Argumentumok.main(new String[]{"neptun", "macska", "nyuszi", "lovacska"});
        assertEquals("hibas eredmeny", "macska" + System.lineSeparator() + "lovacska", sout.toString().trim());
    }

    @Test
    public void teszt_07() {
        Argumentumok.main(new String[]{"macska", "neptun", "ora", "prog1", "ember"});
        assertEquals("hibas eredmeny", "neptun" + System.lineSeparator() + "prog1", sout.toString().trim());
    }

    @Test
    public void teszt_08() {
        Argumentumok.main(new String[]{"macska", "neptun", "ora", "prog1", "ember", "utolso"});
        assertEquals("hibas eredmeny", "neptun" + System.lineSeparator() + "prog1" + System.lineSeparator() + "utolso", sout.toString().trim());
    }
}