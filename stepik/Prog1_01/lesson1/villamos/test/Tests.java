import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        int[] array1 = {1, 4};
        assertTrue("Hibas eredmeny", Munka.villamos(array1));
    }

    @Test
    public void teszt_02() {
        int[] array2 = {7, 3, 5, 2, 6, 0};
        assertTrue("Hibas eredmeny", Munka.villamos(array2));
    }

    @Test
    public void teszt_03() {
        int[] array3 = {5, 7, -3, -2, -3};
        assertTrue("Hibas eredmeny", Munka.villamos(array3));
    }

    @Test
    public void teszt_04() {
        int[] array4 = {3, 5, -8, 3, -3, 5, -5};
        assertTrue("Hibas eredmeny", Munka.villamos(array4));
    }

    @Test
    public void teszt_05() {
        int[] array5 = {3, -4, 2, 5, 7};
        assertFalse("Hibas eredmeny", Munka.villamos(array5));
    }

    @Test
    public void teszt_06() {
        int[] array6 = {5, 5, -3, -3, -3, -2, 1};
        assertFalse("Hibas eredmeny", Munka.villamos(array6));
    }

    @Test
    public void teszt_07() {
        int[] array7 = {6, 3, 5, -30};
        assertFalse("Hibas eredmeny", Munka.villamos(array7));
    }
}