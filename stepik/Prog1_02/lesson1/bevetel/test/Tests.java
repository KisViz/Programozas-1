import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 10, Integer.parseInt(doArgumentTest(Bevetel.class, "5", "2")));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 0, Integer.parseInt(doArgumentTest(Bevetel.class, "5")));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 90, Integer.parseInt(doArgumentTest(Bevetel.class, "5", "2", "3", "7", "0", "1", "5")));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 414, Integer.parseInt(doArgumentTest(Bevetel.class, "23", "2", "3", "7", "0", "1", "5")));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 3790, Integer.parseInt(doArgumentTest(Bevetel.class, "10", "52", "44", "73", "210")));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 8400168564L, Long.parseLong(doArgumentTest(Bevetel.class, "4", "42141", "2100000000")));
    }
}