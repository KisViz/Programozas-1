import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Lufi: osztaly hibas", testClass(Lufi.class, Modifier.PUBLIC, Object.class, Kipukkanthato.class));
        assertTrue("Lufi: kipukkan hibas", testMethod(Lufi.class, "kipukkan", void.class, Modifier.PUBLIC));

        Lufi l = new Lufi();
        String res = getSout(getMethod(Lufi.class, "kipukkan"), l);
        assertEquals("kipukkan metodus hibas", "pukk!", res);
    }
}