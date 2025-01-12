import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kicsik extends TestHelper {
    @Test
    public void teszt_01() {
        assertEquals("kicsik metodus hibas", 3, Madar.kicsik(madarak1, 10));
    }

    @Test
    public void teszt_02() {
        assertEquals("kicsik metodus hibas", 0, Madar.kicsik(madarak1, 3));
    }

    @Test
    public void teszt_03() {
        assertEquals("kicsik metodus hibas", 2, Madar.kicsik(madarak2, 5));
    }

    @Test
    public void teszt_04() {
        assertEquals("kicsik metodus hibas", 1, Madar.kicsik(madarak2, 2));
    }

    @Test
    public void teszt_05() {
        assertEquals("kicsik metodus hibas", 0, Madar.kicsik(madarak2, -500));
    }

    @Test
    public void teszt_06() {
        assertEquals("kicsik metodus hibas (ures tomb)", 0, Madar.kicsik(madarak3, 5));
    }
}
