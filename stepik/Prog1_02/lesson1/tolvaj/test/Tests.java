import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        assertTrue("hibas eredmeny", Tolvaj.koSzamlalas(5, new int[] {3}));
    }

    @Test
    public void teszt_02() {
        assertTrue("hibas eredmeny", Tolvaj.koSzamlalas(15, new int[] {3, 5, 6}));
    }

    @Test
    public void teszt_03() {
        assertTrue("hibas eredmeny", Tolvaj.koSzamlalas(30, new int[] {3, 5, 5, 4, 2, 11}));
    }

    @Test
    public void teszt_04() {
        assertTrue("hibas eredmeny", Tolvaj.koSzamlalas(5, new int[] {1, 1, 1, 1, 1}));
    }

    @Test
    public void teszt_05() {
        assertFalse("hibas eredmeny", Tolvaj.koSzamlalas(5, new int[] {1, 1, 1, 2, 2}));
    }

    @Test
    public void teszt_06() {
        assertTrue("hibas eredmeny", Tolvaj.koSzamlalas(140, new int[] {30, 30, 30, 30, 20}));
    }

    @Test
    public void teszt_07() {
        assertFalse("hibas eredmeny", Tolvaj.koSzamlalas(1000, new int[] {10, 10, 980, 1}));
    }
}