import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        int[][] elvart = {{1, 2, 3}, {2, 4, 6}};
        int[][] res = Szorzotabla.letrehoz(2, 3);

        assertEquals("Tomb merete hibas", 2, res.length);
        assertEquals("Tomb merete hibas", 3, res[0].length);
        assertTrue("Hibas megoldas", Arrays.deepEquals(elvart, res));
    }

    @Test
    public void teszt_02() {
        int[][] elvart = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        int[][] res = Szorzotabla.letrehoz(1, 10);

        assertEquals("Tomb merete hibas", 1, res.length);
        assertEquals("Tomb merete hibas", 10, res[0].length);
        assertTrue("Hibas megoldas", Arrays.deepEquals(elvart, res));
    }

    @Test
    public void teszt_03() {
        int[][] elvart = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}};
        int[][] res = Szorzotabla.letrehoz(10, 1);

        assertEquals("Tomb merete hibas", 10, res.length);
        assertEquals("Tomb merete hibas", 1, res[0].length);
        assertTrue("Hibas megoldas", Arrays.deepEquals(elvart, res));
    }

    @Test
    public void teszt_04() {
        int[][] elvart = {{1, 2, 3, 4, 5, 6}, {2, 4, 6, 8, 10, 12}, {3, 6, 9, 12, 15, 18}, {4, 8, 12, 16, 20, 24}};
        int[][] res = Szorzotabla.letrehoz(4, 6);

        assertEquals("Tomb merete hibas", 4, res.length);
        assertEquals("Tomb merete hibas", 6, res[0].length);
        assertTrue("Hibas megoldas", Arrays.deepEquals(elvart, res));
    }
}