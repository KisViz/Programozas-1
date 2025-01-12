import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    Beka beka = new Beka();

    @Test
    public void brekeg() {
        assertTrue("brekeg metodus hibas", testMethod(Beka.class, "brekeg", String.class, Modifier.PUBLIC));
        assertEquals("brekeg metodus hibas", "brekeke", beka.brekeg());
    }

    @Test
    public void eszik() {
        assertTrue("eszik metodus hibas", testMethod(Beka.class, "eszik", void.class, Modifier.PUBLIC, Legy.class));
    }

    @Test
    public void ehes() {
        assertTrue("ehes metodus hibas", testMethod(Beka.class, "ehes", boolean.class, Modifier.PUBLIC));
        assertTrue("ehes metodus hibas", beka.ehes());
    }
}