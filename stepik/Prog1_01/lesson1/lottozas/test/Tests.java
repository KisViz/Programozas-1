import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests extends BaseTest {
    @Test
    public void fejlec() {
        if (!testMethod(Lottozas.class, "lotto", int.class, Modifier.STATIC, int[].class, int[].class) &&
            !testMethod(Lottozas.class, "lotto", int.class, Modifier.STATIC | Modifier.PUBLIC, int[].class, int[].class)) {
            fail("A fuggveny fejlece nem megfelelo!");
        }
    }

    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 1, Lottozas.lotto(new int[] {1, 2, 3, 4, 5}, new int[] {5, 6, 7, 8, 9}));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 2, Lottozas.lotto(new int[] {8, 4, 7, 5}, new int[] {4, 7, 11, 15}));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 1, Lottozas.lotto(new int[] {1}, new int[] {1}));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 0, Lottozas.lotto(new int[] {30, 50, 20, 1, 5}, new int[] {90, 70, 55, 34, 73}));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 6, Lottozas.lotto(new int[] {5, 8, 15, 33, 40, 70}, new int[] {5, 8, 15, 33, 40, 70}));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 8, Lottozas.lotto(new int[] {77, 120, 56, 420, 66, 1, 7, 100}, new int[] {100, 56, 77, 1, 420, 66, 7, 120}));
    }
}