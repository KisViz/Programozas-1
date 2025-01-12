import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests extends BaseTest {
    @Test
    public void fejlec() {
        if (!testMethod(Hegymaszas.class, "maszas", int.class, Modifier.STATIC, int[].class) &&
            !testMethod(Hegymaszas.class, "maszas", int.class, Modifier.STATIC | Modifier.PUBLIC, int[].class)) {
            fail("Hibas fuggveny fejlec");
        }
    }

    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 15, Hegymaszas.maszas(new int[] {4, 7, 10, 15}));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 100, Hegymaszas.maszas(new int[] {100, 65, 53, 31, 10}));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 15, Hegymaszas.maszas(new int[] {5, 10, 15, 10}));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 23, Hegymaszas.maszas(new int[] {3, 5, 3, 6, 2, 5, 4, 8, 2, 10}));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 34, Hegymaszas.maszas(new int[] {10, 12, 7, 7, 7, 20, 11, 20}));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 170, Hegymaszas.maszas(new int[] {-100, 70}));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", 1700, Hegymaszas.maszas(new int[] {100, -100, 100, -100, 100, -100, 100, -1000, -500, -500, -500, -500, -500, 0}));
    }
}