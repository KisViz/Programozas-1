import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        assertTrue("Hibas eredmeny", Vasarlas.vasarlas(100, 40));
    }

    @Test
    public void teszt_02() {
        assertTrue("Hibas eredmeny", Vasarlas.vasarlas(10, 7));
    }

    @Test
    public void teszt_03() {
        assertTrue("Hibas eredmeny", Vasarlas.vasarlas(23, 23));
    }

    @Test
    public void teszt_04() {
        assertFalse("Hibas eredmeny", Vasarlas.vasarlas(100, 111));
    }

    @Test
    public void teszt_05() {
        assertFalse("Hibas eredmeny", Vasarlas.vasarlas(10, 23));
    }

    @Test
    public void teszt_06() {
        assertFalse("Hibas eredmeny", Vasarlas.vasarlas(23, 24));
    }

    @Test
    public void teszt_07() {
        assertFalse("Hibas eredmeny", Vasarlas.vasarlas(10, 40));
    }
}