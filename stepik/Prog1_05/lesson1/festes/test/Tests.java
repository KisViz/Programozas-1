import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("befest metodus hibas", testMethod(Festheto.class, "befest", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, String.class));
    }
}