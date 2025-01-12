import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Epulet hibas", testClass(Epulet.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class));
    }
}