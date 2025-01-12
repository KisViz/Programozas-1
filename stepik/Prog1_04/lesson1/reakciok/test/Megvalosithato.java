import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Megvalosithato {
    @Test
    public void teszt_01() {
        assertFalse("Hibas megoldas", Reakcio.megvalosithato("macska"));
    }

    @Test
    public void teszt_02() {
        assertTrue("Hibas megoldas", Reakcio.megvalosithato("szia"));
    }

    @Test
    public void teszt_03() {
        assertFalse("Hibas megoldas", Reakcio.megvalosithato("egyetertek"));
    }

    @Test
    public void teszt_04() {
        assertFalse("Hibas megoldas", Reakcio.megvalosithato("vajonmegismer"));
    }

    @Test
    public void teszt_05() {
        assertTrue("Hibas megoldas", Reakcio.megvalosithato("abcxyzdefg"));
    }
}