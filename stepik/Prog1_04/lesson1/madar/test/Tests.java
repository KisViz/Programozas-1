import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void testSolution() {
        assertTrue("fajta hibas", testField(Madar.class, "fajta", String.class, Modifier.PROTECTED));
        assertTrue("repul hibas", testField(Madar.class, "repul", boolean.class, Modifier.PROTECTED));
        assertTrue("meret hibas", testField(Madar.class, "meret", int.class, Modifier.PROTECTED));
    }
}