import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class Bonyolult {
    @Test
    public void teszt_01() {
        Csokor[] raktarkeszlet = {
                TestHelper.createCsokor(2, 5),
                TestHelper.createCsokor(5, 3)
        };

        Csokor[] rendeles = {
                TestHelper.createCsokor(2, 4),
                TestHelper.createCsokor(4, 4)
        };

        assertFalse("Hibas eredmeny", Bolt.viragRendeles(raktarkeszlet, rendeles));
    }
}
