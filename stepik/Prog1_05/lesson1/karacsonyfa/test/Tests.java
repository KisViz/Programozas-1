import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Karacsonyfa hibas", testClass(Karacsonyfa.class, Modifier.PUBLIC, Object.class, Fa.class, Dekoracio.class));
    }
}