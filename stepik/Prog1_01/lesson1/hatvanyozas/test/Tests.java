import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 1, Hatvanyozas.hatvany(0, 0));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 8, Hatvanyozas.hatvany(2, 3));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 36, Hatvanyozas.hatvany(6, 2));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 1024, Hatvanyozas.hatvany(2, 10));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 1, Hatvanyozas.hatvany(1, 5));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 1, Hatvanyozas.hatvany(141, 0));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", 0, Hatvanyozas.hatvany(0, 41));
    }

    @Test
    public void teszt_08() {
        assertEquals("hibas eredmeny", 3200, Hatvanyozas.hatvany(3200, 1));
    }
}