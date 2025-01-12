import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 3,  Gyar.PPAP(6, 3, 3));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 3, Gyar.PPAP(11, 3, 3));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 4, Gyar.PPAP(10, 5, 4));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 2, Gyar.PPAP(10, 2, 7));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 60, Gyar.PPAP(120, 71, 69));
    }
}