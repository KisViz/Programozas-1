import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void ososztaly() {
        assertEquals("az ososztaly modositva lett!", 2, fieldCount(Allat.class));
        assertEquals("az ososztaly modositva lett!", 1, methodCount(Allat.class));
        assertEquals("az ososztaly modositva lett!", 1, constructorCount(Allat.class));

        assertTrue("az ososztaly modositva lett!", testField(Allat.class, "alfaj", String.class, Modifier.PRIVATE));
        assertTrue("az ososztaly modositva lett!", testField(Allat.class, "meret", int.class, Modifier.PRIVATE));
    }

    @Test
    public void ososztalyTostring() {
        assertEquals("az ososztaly toString-je nem jo", "macska 3", new Allat("macska", 3).toString());
        assertEquals("az ososztaly toString-je nem jo", "elefant 30000", new Allat("elefant", 30000).toString());
        assertEquals("az ososztaly toString-je nem jo", "cinege 1", new Allat("cinege", 1).toString());
    }

    @Test
    public void tostring() {
        assertEquals("az eger toString-je nem jo", "eger 3 7", new Eger(3, 7).toString());
        assertEquals("az eger toString-je nem jo", "eger 7 1", new Eger(7, 1).toString());
        assertEquals("az eger toString-je nem jo", "eger 10 30", new Eger(10, 30).toString());
    }
}