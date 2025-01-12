import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Egydimenzio extends TestHelper {
    @Test
    public void teszt_01() {
        assertTrue("Egy dimenzios tomb hibas", doOneDimensionTest(1));
    }

    @Test
    public void teszt_02() {
        assertTrue("Egy dimenzios tomb hibas", doOneDimensionTest(2));
    }

    @Test
    public void teszt_03() {
        assertTrue("Egy dimenzios tomb hibas", doOneDimensionTest(5));
    }

    @Test
    public void teszt_04() {
        assertTrue("Egy dimenzios tomb hibas", doOneDimensionTest(6));
    }

    @Test
    public void teszt_05() {
        assertTrue("Egy dimenzios tomb hibas", doOneDimensionTest(15040));
    }
}
