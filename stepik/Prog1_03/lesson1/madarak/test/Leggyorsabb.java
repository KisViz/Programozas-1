import org.junit.Test;

import static org.junit.Assert.assertSame;

public class Leggyorsabb extends TestHelper {
    @Test
    public void teszt_01() {
        assertSame("leggyorsabb metodus hibas", m3, Madar.leggyorsabb(madarak1));
    }

    @Test
    public void teszt_02() {
        assertSame("leggyorsabb metodus hibas", m6, Madar.leggyorsabb(madarak2));
    }

    @Test
    public void teszt_03() {
        assertSame("leggyorsabb metodus hibas", null, Madar.leggyorsabb(madarak3));
    }
}
