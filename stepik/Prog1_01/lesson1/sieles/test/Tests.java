import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 1, Sieles.sieles(5, 10, 11));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 1, Sieles.sieles(7, 10, 2));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 1, Sieles.sieles(3, 5, 2));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 1, Sieles.sieles(5, 50, 10));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 0, Sieles.sieles(3, 10, 3));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 0, Sieles.sieles(5, 50, 9));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", 0, Sieles.sieles(50, 51, 1));
    }
}