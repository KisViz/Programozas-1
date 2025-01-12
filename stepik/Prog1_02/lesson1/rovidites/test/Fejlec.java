import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Fejlec extends BaseTest {

    @Test
    public void teszt_01() {
        if (!testMethod(Rovidites.class, "dekodolas", String.class, Modifier.STATIC, String.class)) {
            fail("Hibas fuggveny fejlec");
        }
    }
}