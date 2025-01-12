import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        int[] kovek1 = {4, 7, 2, 1, 6, 3};
        assertEquals("Hibas eredmeny", 0, Ko.kovek(kovek1, 23));
    }

    @Test
    public void teszt_02() {
        int[] kovek2 = {1};
        assertEquals("Hibas eredmeny", 0, Ko.kovek(kovek2, 1));
    }

    @Test
    public void teszt_03() {
        int[] kovek3 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        assertEquals("Hibas eredmeny", 1, Ko.kovek(kovek3, 29));
    }

    @Test
    public void teszt_04() {
        int[] kovek4 = {101, 4, 2};
        assertEquals("Hibas eredmeny", 6, Ko.kovek(kovek4, 101));
    }

    @Test
    public void teszt_05() {
        int[] kovek4 = {101, 4, 2};
        assertEquals("Hibas eredmeny", 107, Ko.kovek(kovek4, 0));
    }


}