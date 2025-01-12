import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        setInput("macska", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", "nem", sout.toString().trim());
    }

    @Test
    public void teszt_02() {
        setInput("macska", "kutya", "lo", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", String.join(System.lineSeparator(), "nem", "nem", "nem"), sout.toString().trim());
    }

    @Test
    public void teszt_03() {
        setInput("ollo", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", "igen", sout.toString().trim());
    }

    @Test
    public void teszt_04() {
        setInput("lovacska", "ollo", "med dem", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", String.join(System.lineSeparator(), "nem", "igen", "igen"), sout.toString().trim());
    }

    @Test
    public void teszt_05() {
        setInput("asd   dsa", "asdsa", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", String.join(System.lineSeparator(), "igen", "igen"), sout.toString().trim());
    }

    @Test
    public void teszt_06() {
        setInput("asddsa", "asfdsa", "asdfdsa", "asdqqsa", "aa", "v", "qaq", "aqq", "");
        Palindrom.main(new String[] {});
        assertEquals("Hibas eredmeny", String.join(System.lineSeparator(), "igen", "nem", "igen", "nem", "igen", "igen", "igen", "nem"), sout.toString().trim());
    }
}