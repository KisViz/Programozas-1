import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattag() {
        assertTrue("adattag hibas", testField(Naptar.class, "teendok", List.class, Modifier.PRIVATE));
    }

    @Test
    public void konstruktor() {
        Naptar n = new Naptar();
        List<String> t = (List<String>) fieldValue(Naptar.class, "teendok", n);
        assertNotNull("A lista nincs letrehozva", n);

        t.add("elso");
        assertEquals("A lista nem jol van letrehozva", "elso", t.get(0));
    }
}