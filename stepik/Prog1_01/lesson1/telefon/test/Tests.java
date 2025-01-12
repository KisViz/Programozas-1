import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests extends BaseTest {
    @Test
    public void fejlec() {
        if (!testMethod(Telefon.class, "eladas", int.class, Modifier.STATIC, int.class, int.class, int.class) &&
            !testMethod(Telefon.class, "eladas", int.class, Modifier.STATIC | Modifier.PUBLIC, int.class, int.class, int.class)) {
            fail("A fuggveny fejlece nem megfelelo!");
        }
    }

    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 1, Telefon.eladas(1000, 500, 2000));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 2, Telefon.eladas(1000, 1200, 2000));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 3, Telefon.eladas(1000, 1000, 1500));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 501, Telefon.eladas(300, 10000, 320));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 1, Telefon.eladas(300, 0, 320));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", -1, Telefon.eladas(300, 0, 300));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", -1, Telefon.eladas(300, 0, 299));
    }

    @Test
    public void teszt_08() {
        assertEquals("hibas eredmeny", -1, Telefon.eladas(300, 1000, 300));
    }

    @Test
    public void teszt_09() {
        assertEquals("hibas eredmeny", -1, Telefon.eladas(15, 100, 0));
    }
}