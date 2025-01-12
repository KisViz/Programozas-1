import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    Kulonbozo k = new Kulonbozo();

    @Test
    public void teszt_01() {
        assertTrue("hibas eredmeny", k.kulonbozo(4));
    }

    @Test
    public void teszt_02() {
        assertTrue("hibas eredmeny", k.kulonbozo(-511));
    }

    @Test
    public void teszt_03() {
        assertTrue("hibas eredmeny", k.kulonbozo(4511));
    }

    @Test
    public void teszt_04() {
        assertTrue("hibas eredmeny", k.kulonbozo(4));
    }

    @Test
    public void teszt_05() {
        assertTrue("hibas eredmeny", k.kulonbozo(40000));
    }

    @Test
    public void teszt_06() {
        assertTrue("hibas eredmeny", k.kulonbozo(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void teszt_07() {
        assertTrue("hibas eredmeny", k.kulonbozo(Double.POSITIVE_INFINITY));
    }

    @Test
    public void teszt_08() {
        assertFalse("hibas eredmeny", k.kulonbozo(0.0/0.0));
    }

    @Test
    public void teszt_09() {
        assertTrue("hibas eredmeny", k.kulonbozo(0.0/7));
    }

    @Test
    public void teszt_10() {
        assertTrue("hibas eredmeny", k.kulonbozo(7/0.0));
    }

    @Test
    public void teszt_11() {
        assertFalse("hibas eredmeny", k.kulonbozo(Double.NaN));
    }
}