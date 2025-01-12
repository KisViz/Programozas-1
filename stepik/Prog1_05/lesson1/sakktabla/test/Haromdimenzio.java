import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Haromdimenzio extends TestHelper {
    @Test
    public void teszt_01() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 1));
    }

    @Test
    public void teszt_02() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 2));
    }

    @Test
    public void teszt_03() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 3));
    }

    @Test
    public void teszt_04() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 4));
    }

    @Test
    public void teszt_05() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 40));
    }

    @Test
    public void teszt_06() {
        assertTrue("Harom dimenzios tomb hibas", doHigherDimensionTest(3, 61));
    }
}
