import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Megtalalhato extends TestHelper {

    @Test
    public void teszt_01() {
        assertTrue("megtalalhato metodus hibas", Madar.megtalalhato(madarak1, "Hollo"));
    }

    @Test
    public void teszt_02() {
        assertTrue("megtalalhato metodus hibas", Madar.megtalalhato(madarak1, "rigo"));
    }

    @Test
    public void teszt_03() {
        assertFalse("megtalalhato metodus hibas", Madar.megtalalhato(madarak1, "rigorigo"));
    }

    @Test
    public void teszt_04() {
        assertFalse("megtalalhato metodus hibas", Madar.megtalalhato(madarak2, "Hollo"));
    }

    @Test
    public void teszt_05() {
        assertTrue("megtalalhato metodus hibas", Madar.megtalalhato(madarak2, "rigo"));
    }

    @Test
    public void teszt_06() {
        assertFalse("megtalalhato metodus hibas", Madar.megtalalhato(madarak3, "rigo"));
    }
}