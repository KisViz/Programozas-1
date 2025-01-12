import org.junit.Test;

import static org.junit.Assert.*;

public class Alapeset {
    @Test
    public void teszt_01() {
        Csokor[] raktarkeszlet = {
            TestHelper.createCsokor(1, 5),
            TestHelper.createCsokor(2, 3),
            TestHelper.createCsokor(3, 7),
            TestHelper.createCsokor(4, 2)
        };

        Csokor[] rendeles = {
            TestHelper.createCsokor(1, 3),
            TestHelper.createCsokor(2, 1),
            TestHelper.createCsokor(3, 4),
            TestHelper.createCsokor(4, 1)
        };

        assertTrue("Hibas eredmeny", Bolt.viragRendeles(raktarkeszlet, rendeles));
    }

    @Test
    public void teszt_02() {
        Csokor[] raktarkeszlet2 = {
                TestHelper.createCsokor(1, 5),
                TestHelper.createCsokor(2, 3),
                TestHelper.createCsokor(3, 7),
                TestHelper.createCsokor(4, 2)
        };

        Csokor[] rendeles2 = {
                TestHelper.createCsokor(1, 3),
                TestHelper.createCsokor(2, 4),
                TestHelper.createCsokor(3, 4),
                TestHelper.createCsokor(4, 1)
        };

        assertFalse("Hibas eredmeny", Bolt.viragRendeles(raktarkeszlet2, rendeles2));
    }
}