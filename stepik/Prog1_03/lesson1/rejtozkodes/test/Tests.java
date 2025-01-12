import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void alfaj() {
        assertTrue("alfaj hibas", testField(Kameleon.class, "alfaj", String.class, Modifier.PRIVATE));
    }

    @Test
    public void meret() {
        assertTrue("meret hibas", testField(Kameleon.class, "meret", int.class, Modifier.PRIVATE));
    }

    @Test
    public void szin() {
        assertTrue("szin hibas", testField(Kameleon.class, "szin", String.class, Modifier.PRIVATE));
    }
}