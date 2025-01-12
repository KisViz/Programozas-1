import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void ijasz() {
        assertTrue("Ijasz osztaly hibas", testClass(Ijasz.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class, Katona.class));
        assertTrue("Ijasz: kozelharciTamadas hibas", testMethod(Ijasz.class, "kozelharciTamadas", int.class, Modifier.PUBLIC | Modifier.FINAL, Katona.class));
        assertTrue("Ijasz: tavolsagiTamadas hibas", testMethodInherited(Ijasz.class, "tavolsagiTamadas", int.class, Modifier.PUBLIC | Modifier.ABSTRACT, Katona.class));

    }

    @Test
    public void pajzsosHarcos() {
        assertTrue("PajzsosHarcos osztaly hibas", testClass(PajzsosHarcos.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class, Katona.class));
        assertTrue("PajzsosHarcos: kozelharciTamadas hibas", testMethodInherited(PajzsosHarcos.class, "kozelharciTamadas", int.class, Modifier.PUBLIC | Modifier.ABSTRACT, Katona.class));
        assertTrue("PajzsosHarcos: tavolsagiTamadas hibas", testMethod(PajzsosHarcos.class, "tavolsagiTamadas", int.class, Modifier.PUBLIC | Modifier.FINAL, Katona.class));
    }
}