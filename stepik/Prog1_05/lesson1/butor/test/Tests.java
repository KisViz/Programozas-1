import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        assertTrue("Butor osztaly nem megfelelo", testClass(Butor.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class));
        assertTrue("tonkremegy metodus hibas", testMethod(Butor.class, "tonkremegy", String.class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }
}