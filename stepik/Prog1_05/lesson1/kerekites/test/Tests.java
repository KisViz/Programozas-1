import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
      assertEquals("hibas eredmeny", 5, Kerekites.kerekites(5), 0.0001);
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 2.2, Kerekites.kerekites(2.2), 0.0001);
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 7.32, Kerekites.kerekites(7.32), 0.0001);
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 4.21, Kerekites.kerekites(4.21), 0.0001);
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 7.32, Kerekites.kerekites(7.322), 0.0001);
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 17.97, Kerekites.kerekites(17.9799), 0.0001);
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", 15.00, Kerekites.kerekites(15.009999999999), 0.0001);
    }

    @Test
    public void teszt_08() {
        assertEquals("hibas eredmeny", 1.99, Kerekites.kerekites(1.99999999999), 0.0001);
    }
}
