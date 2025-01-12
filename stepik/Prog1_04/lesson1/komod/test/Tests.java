import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Tests extends BaseTest {
    @Test
    public void ososztaly() {
        int fieldCount = Butor.class.getDeclaredFields().length;
        int methodCount = Butor.class.getDeclaredMethods().length;
        int constructorCount = Butor.class.getConstructors().length;

        assertEquals("az ososztaly modositva lett", 3, fieldCount);
        assertEquals("az ososztaly modositva lett", 3, methodCount);
        assertEquals("az ososztaly modositva lett", 1, constructorCount);
    }

    @Test
    public void teszt_01() {
        Komod k1 = new Komod(5, 4, 3, 2);
        assertEquals("magassag hibas", 5, k1.getMagassag());
        assertEquals("szelesseg hibas", 4, k1.getSzelesseg());
        assertEquals("melyseg hibas", 3, k1.getMelyseg());
        assertEquals("fiokokSzama hibas", 2, k1.getFiokokSzama());
    }

    @Test
    public void teszt_02() {
        Komod k2 = new Komod(7, 2, 4, 3);
        assertEquals("magassag hibas", 7, k2.getMagassag());
        assertEquals("szelesseg hibas", 2, k2.getSzelesseg());
        assertEquals("melyseg hibas", 4, k2.getMelyseg());
        assertEquals("fiokokSzama hibas", 3, k2.getFiokokSzama());
    }
}