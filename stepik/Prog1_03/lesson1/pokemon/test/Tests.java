import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        Pokemon p = new Pokemon("a", "b");
        assertEquals("EGY POKEMON LETREJOTT" + System.lineSeparator(), sout.toString());
        assertEquals("a", fieldValue(Pokemon.class, "nev", p));
        assertEquals("b", fieldValue(Pokemon.class, "allapot", p));
    }

    @Test
    public void teszt_02() {
        Pokemon pp = new Pokemon("bbb", "aaa");
        assertEquals("EGY POKEMON LETREJOTT" + System.lineSeparator(), sout.toString());
        assertEquals("bbb", fieldValue(Pokemon.class, "nev", pp));
        assertEquals("aaa", fieldValue(Pokemon.class, "allapot", pp));
    }

    @Test
    public void teszt_03() {
        Pokemon p = new Pokemon("a");
        assertEquals("EGY POKEMON LETREJOTT" + System.lineSeparator(), sout.toString());
        assertEquals("a", fieldValue(Pokemon.class, "nev", p));
        assertEquals("szabad", fieldValue(Pokemon.class, "allapot", p));
    }

    @Test
    public void teszt_04() {
        Pokemon pp = new Pokemon("qqq");
        assertEquals("EGY POKEMON LETREJOTT" + System.lineSeparator(), sout.toString());
        assertEquals("qqq", fieldValue(Pokemon.class, "nev", pp));
        assertEquals("szabad", fieldValue(Pokemon.class, "allapot", pp));
    }
}