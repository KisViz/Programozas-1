import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        int[] homersekletek = {7, 3};
        assertEquals("Hibas megoldas", 5, Homerseklet.atlaghomerseklet(homersekletek), 0.001);
    }

    @Test
    public void teszt_02() {
        int[] homersekletek = {2};
        assertEquals("Hibas megoldas", 2, Homerseklet.atlaghomerseklet(homersekletek), 0.001);
    }

    @Test
    public void teszt_03() {
        int[] homersekletek = {4, 6, 1, -5, -2, 0, 1};
        assertEquals("Hibas megoldas", 0.714285, Homerseklet.atlaghomerseklet(homersekletek), 0.001);
    }

    @Test
    public void teszt_04() {
        int[] homersekletek = {1, 0, 1, 1, 5, 10, 22, 25, 4, 0};
        assertEquals("Hibas megoldas", 6.9, Homerseklet.atlaghomerseklet(homersekletek), 0.001);
    }

    @Test
    public void teszt_05() {
        int[] homersekletek = {-2, -4, -1, -2};
        assertEquals("Hibas megoldas", -2.25, Homerseklet.atlaghomerseklet(homersekletek), 0.001);
    }
}