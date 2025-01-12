import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Ketdimenzio extends TestHelper {
    @Test
    public void teszt_01() {
        assertTrue("Ket dimenzios tomb hibas", doHigherDimensionTest(2, 1));
    }

    @Test
    public void teszt_02() {
        assertTrue("Ket dimenzios tomb hibas", doHigherDimensionTest(2, 2));
    }

    @Test
    public void teszt_03() {
        assertTrue("Ket dimenzios tomb hibas", doHigherDimensionTest(2, 3));
    }

    @Test
    public void teszt_04() {
        assertTrue("Ket dimenzios tomb hibas", doHigherDimensionTest(2, 420));
    }

    @Test
    public void teszt_05() {
        assertTrue("Ket dimenzios tomb hibas", doHigherDimensionTest(2, 1051));
    }
}
