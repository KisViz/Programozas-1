import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Az adattag hibas", testField(Uralkodo.class, "orszag", String.class, Modifier.PUBLIC));

        Uralkodo u = new Uralkodo();
        u.orszag = "Macskaorszag";
        assertEquals("Az orszag nem megfelelo", "Macskaorszag", u.orszag);
    }
}