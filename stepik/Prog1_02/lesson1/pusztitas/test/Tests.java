import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests extends BaseTest {
    @Test
    public void fejlec() {
        if (!testMethod(Pusztitas.class, "osszegyujtes", int.class, Modifier.STATIC, int[].class, int.class) &&
            !testMethod(Pusztitas.class, "osszegyujtes", int.class, Modifier.STATIC | Modifier.PUBLIC, int[].class, int.class)) {
            fail("Hibas fuggveny fejlec");
        }
    }

    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 2, Pusztitas.osszegyujtes(new int[] {2, 2, 2}, 3));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 3, Pusztitas.osszegyujtes(new int[] {5, 8, 11, 6}, 10));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 1, Pusztitas.osszegyujtes(new int[] {3, 0, 0, 0, 0, 0, 0, 7}, 10));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 1, Pusztitas.osszegyujtes(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 12));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 2, Pusztitas.osszegyujtes(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 12));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 0, Pusztitas.osszegyujtes(new int[] {0, 0, 0, 0, 0, 0, 0}, 10));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", 2, Pusztitas.osszegyujtes(new int[] {4, 7, 2, 5}, 11));
    }
}