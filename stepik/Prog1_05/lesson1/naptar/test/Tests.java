import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    Naptar n = new Naptar();

    @Test
    public void teszt_01() {
        assertTrue("hibas megoldas", n.hetvege(2020, 3, 21));
    }

    @Test
    public void teszt_02() {
        assertTrue("hibas megoldas", n.hetvege(2020, 3, 22));
    }

    @Test
    public void teszt_03() {
        assertFalse("hibas megoldas", n.hetvege(2020, 3, 23));
    }

    @Test
    public void teszt_04() {
        assertFalse("hibas megoldas", n.hetvege(2021, 12, 31));
    }

    @Test
    public void teszt_05() {
        assertTrue("hibas megoldas", n.hetvege(2022, 1, 1));
    }

    @Test
    public void teszt_06() {
        assertTrue("hibas megoldas", n.hetvege(2022, 1, 2));
    }

    @Test
    public void teszt_07() {
        assertTrue("hibas megoldas", n.hetvege(2119, 11, 25));
    }

    @Test
    public void teszt_08() {
        assertFalse("hibas megoldas", n.hetvege(2119, 11, 24));
    }

    @Test
    public void teszt_09() {
        assertFalse("hibas megoldas", n.hetvege(2119, 11, 27));
    }

    @Test
    public void teszt_10() {
        assertFalse("hibas megoldas", n.hetvege(1848, 3, 15));
    }

    @Test
    public void teszt_11() {
        assertTrue("hibas megoldas", n.hetvege(1848, 3, 18));
    }

    @Test
    public void teszt_12() {
        assertTrue("hibas megoldas", n.hetvege(1848, 3, 19));
    }

    @Test
    public void teszt_13() {
        assertFalse("hibas megoldas", n.hetvege(1904, 2, 29));
    }

    @Test
    public void teszt_14() {
        assertTrue("hibas megoldas", n.hetvege(1908, 2, 29));
    }
}