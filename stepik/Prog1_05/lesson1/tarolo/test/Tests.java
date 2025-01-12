import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("kivesz metodus hibas", testMethod(Tarolo.class, "kivesz", int.class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }
}