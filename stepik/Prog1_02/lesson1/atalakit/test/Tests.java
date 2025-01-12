import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    @Test
    public void teszt_01() {
        String[] eredeti = {"7", "11", "30", "2"};
        int[] elvart = {7, 11, 30, 2};

        int[] res = Atalakit.atalakitas(eredeti);

        assertArrayEquals("Hibas megoldas", elvart, res);
    }

    @Test
    public void teszt_02() {
        String[] eredeti = {"0", "-5", "7", "2120"};
        int[] elvart = {0, -5, 7, 2120};

        int[] res = Atalakit.atalakitas(eredeti);

        assertArrayEquals("Hibas megoldas", elvart, res);
    }

    @Test
    public void teszt_03() {
        String[] eredeti = {};
        int[] elvart = {};

        int[] res = Atalakit.atalakitas(eredeti);

        assertArrayEquals("Hibas megoldas", elvart, res);
    }

    @Test
    public void teszt_04() {
        String[] eredeti = {"20000", "-400", "0", "0", "0", "0", "0"};
        int[] elvart = {20000, -400, 0, 0, 0, 0, 0};

        int[] res = Atalakit.atalakitas(eredeti);

        assertArrayEquals("Hibas megoldas", elvart, res);
    }
}