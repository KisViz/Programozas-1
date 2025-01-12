import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void hatalmiJelkep() {
        assertTrue("HatalmiJelkep hibas", testClass(HatalmiJelkep.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class));
    }

    @Test
    public void jogar() {
        assertTrue("Jogar hibas", testClass(Jogar.class, Modifier.PUBLIC, HatalmiJelkep.class));
    }

    @Test
    public void korona() {
        assertTrue("Korona hibas", testClass(Korona.class, Modifier.PUBLIC, HatalmiJelkep.class));
    }

    @Test
    public void orszagalma() {
        assertTrue("Orszagalma hibas", testClass(Orszagalma.class, Modifier.PUBLIC, HatalmiJelkep.class));
    }
}