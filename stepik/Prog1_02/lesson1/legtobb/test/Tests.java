import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", "Ebbol van a legtobb: 1", doArgumentTest(Szamsokasag.class, "1", "2", "2", "1", "1"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", "Ebbol van a legtobb: 3", doArgumentTest(Szamsokasag.class, "3", "5", "7", "3", "1", "6", "7", "3"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", "Ebbol van a legtobb: -7", doArgumentTest(Szamsokasag.class, "-7", "2", "-2", "2", "-7", "-7", "-2"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", "Ebbol van a legtobb: 100", doArgumentTest(Szamsokasag.class, "100", "100", "1", "2", "3", "-1", "-2", "-3"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", "Ebbol van a legtobb: 1541251", doArgumentTest(Szamsokasag.class, "1541251"));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", "Tobb ilyen szam is van", doArgumentTest(Szamsokasag.class, "0", "0", "0", "-6", "-6", "-6"));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", "Tobb ilyen szam is van", doArgumentTest(Szamsokasag.class, "3", "4"));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", "Tobb ilyen szam is van", doArgumentTest(Szamsokasag.class, "3", "4", "5", "6"));
    }
}