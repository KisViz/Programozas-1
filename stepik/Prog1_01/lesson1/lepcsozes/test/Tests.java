import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        int[] tomb1 = {1, 3, 5, 7, 10};
        assertEquals("Hibas eredmeny", 52, Munkahely.lepcsozes(tomb1, 1));
    }

    @Test
    public void teszt_02() {
        int[] tomb2 = {10};
        assertEquals("Hibas eredmeny", 100, Munkahely.lepcsozes(tomb2, 5));
    }

    @Test
    public void teszt_03() {
        int[] tomb3 = {7, 9, 11};
        assertEquals("Hibas eredmeny", 432, Munkahely.lepcsozes(tomb3, 8));
    }

    @Test
    public void teszt_04() {
        int[] tomb4 = {1, 5, 7};
        assertEquals("Hibas eredmeny", 260, Munkahely.lepcsozes(tomb4, 10));
    }

    @Test
    public void teszt_05() {
        int[] tomb5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals("Hibas eredmeny", 4400, Munkahely.lepcsozes(tomb5, 40));
    }

    @Test
    public void teszt_06() {
        int[] tomb6 = {1, 4, 8, 9, 12, 42};
        assertEquals("Hibas eredmeny", 3040, Munkahely.lepcsozes(tomb6, 20));
    }

    @Test
    public void teszt_07() {
        int[] tomb7 = {20, 40, 55, 72};
        assertEquals("Hibas eredmeny", 5610, Munkahely.lepcsozes(tomb7, 15));
    }
}