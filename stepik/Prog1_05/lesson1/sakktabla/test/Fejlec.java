import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Fejlec extends BaseTest {
    @Test
    public void metodusFejlec() {
        assertTrue("A metodus fejlece nem megfelelo", testMethod(Sakktabla.class, "sakktabla", Object[].class, Modifier.PUBLIC | Modifier.STATIC, int.class, int.class));
    }
}
