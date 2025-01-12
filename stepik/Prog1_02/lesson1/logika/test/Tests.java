import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        assertFalse("hibas eredmeny", Logika.logikai(new boolean[]{true, false, true, true, false, true, false, true, true, true, true}));
    }

    @Test
    public void teszt_02() {
        assertTrue("hibas eredmeny", Logika.logikai(new boolean[]{true, true, true, true, true}));
    }

    @Test
    public void teszt_03() {
        assertFalse("hibas eredmeny", Logika.logikai(new boolean[]{true, true, false}));
    }

    @Test
    public void teszt_04() {
        assertFalse("hibas eredmeny", Logika.logikai(new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false}));
    }

    @Test
    public void teszt_05() {
        assertTrue("hibas eredmeny", Logika.logikai(new boolean[]{}));
    }
}