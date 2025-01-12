import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Zenesz osztaly nem megfelelo", testClass(Zenesz.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class));
        assertTrue("zenel metodus hibas", testMethod(Zenesz.class, "zenel", void.class, Modifier.PUBLIC | Modifier.ABSTRACT, int.class));
    }
}