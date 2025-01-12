import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RandomSorrend {
    @Test
    public void teszt_01() {
        Csokor[] raktarkeszlet = {
                TestHelper.createCsokor(2, 5),
                TestHelper.createCsokor(5, 3)
        };

        Csokor[] rendeles = {
                TestHelper.createCsokor(5, 4),
                TestHelper.createCsokor(2, 2)
        };

        assertFalse("Hibas eredmeny", Bolt.viragRendeles(raktarkeszlet, rendeles));
    }

    @Test
    public void teszt_02() {
        Csokor[] raktarkeszlet2 = {
                TestHelper.createCsokor(7, 55),
                TestHelper.createCsokor(4, 30),
                TestHelper.createCsokor(5, 71),
                TestHelper.createCsokor(11, 21),
                TestHelper.createCsokor(110, 51),
                TestHelper.createCsokor(66, 30),
                TestHelper.createCsokor(21, 71),
                TestHelper.createCsokor(1, 4)
        };

        Csokor[] rendeles2 = {
                TestHelper.createCsokor(5, 40),
                TestHelper.createCsokor(66, 20),
                TestHelper.createCsokor(110, 1),
                TestHelper.createCsokor(7, 5),
                TestHelper.createCsokor(21, 69)
        };

        assertTrue("Hibas eredmeny", Bolt.viragRendeles(raktarkeszlet2, rendeles2));
    }
}
