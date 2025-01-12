import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Rendorkutya hibas", testClass(Rendorkutya.class, Modifier.PUBLIC, Kutya.class, Rendor.class));
    }
}