import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void ososztaly() {
        assertTrue("az ososztaly modositva lett", testField(Jarmu.class, "pozicio", int.class, Modifier.PRIVATE));

        assertEquals("az ososztaly modositva lett", 1, Jarmu.class.getDeclaredFields().length);
        assertEquals("az ososztaly modositva lett", 2, Jarmu.class.getDeclaredMethods().length);
        assertEquals("az ososztaly modositva lett", 1, Jarmu.class.getConstructors().length);
    }

    @Test
    public void halad() {
        Jarmu j = new Jarmu();
        j.halad(2);
        assertEquals("ososztaly halad metodusa hibas", 2, j.getPozicio());

        j.halad(15);
        assertEquals("ososztaly halad metodusa hibas", 17, j.getPozicio());

        j.halad(55);
        assertEquals("ososztaly halad metodusa hibas", 72, j.getPozicio());

        j.halad(5);
        assertEquals("ososztaly halad metodusa hibas", 77, j.getPozicio());

        LovasSzeker l = new LovasSzeker();
        l.halad(2);
        assertEquals("lovasszeker halad metodusa hibas", 2, l.getPozicio());

        l.halad(4);
        assertEquals("lovasszeker halad metodusa hibas", 6, l.getPozicio());

        l.halad(-2);
        assertEquals("lovasszeker halad metodusa hibas", 4, l.getPozicio());

        l.halad(7);
        assertEquals("lovasszeker halad metodusa hibas", 3, l.getPozicio());

        l.halad(4);
        assertEquals("lovasszeker halad metodusa hibas", 7, l.getPozicio());

        l.halad(5);
        assertEquals("lovasszeker halad metodusa hibas", 6, l.getPozicio());
    }
}